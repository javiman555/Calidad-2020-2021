package com.example.reinventatecovid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Buscaminas extends AppCompatActivity implements View.OnTouchListener{
    private Tablero fondo; //Es el fondo donde se escenifica nuestro tablero de buscaminas
    int x, y;
   //Son las distintas casillas de nuestro tablero
    private boolean activo = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscaminas);

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);
        fondo = new Tablero(this);
        fondo.setOnTouchListener(this);
        layout.addView(fondo);

        fondo.setCasillas(new Casilla[8][8]);
        //casillas = new Casilla[8][8];

        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {
                fondo.getCasillas()[f][c] = new Casilla();
                //casillas[f][c] = new Casilla();
            }
        }
        this.disponerBombas();
        this.contarBombasPerimetro();
        getSupportActionBar().hide();
    }

    public void reiniciar(View v) {// Se encarga de reiniciar el tablero del buscaminas reiniciando las casillas del tablero
        fondo.setCasillas(new Casilla[8][8]);
        //casillas = new Casilla[8][8];
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {
                fondo.getCasillas()[f][c] = new Casilla();

            }
        }
        this.disponerBombas();
        this.contarBombasPerimetro();
        activo = true;

        fondo.invalidate();
    }

    public boolean onTouch(View v, MotionEvent event) {//Se encarga de ejecutar todos los procesos del buscaminas, es decir ejecutar el juego
        if (activo)
            for (int f = 0; f < 8; f++) {
                for (int c = 0; c < 8; c++) {
                    if (fondo.getCasillas()[f][c].dentro((int) event.getX(),
                            (int) event.getY())) {
                        fondo.getCasillas()[f][c].destapado = true;
                        if (fondo.getCasillas()[f][c].contenido == 80) {
                            Toast.makeText(this, "Has sido infectado F",
                                    Toast.LENGTH_LONG).show();
                            activo = false;
                        } else if (fondo.getCasillas()[f][c].contenido == 0)
                            recorrer(f, c);
                        fondo.invalidate();
                    }
                }
            }
        if (gano() && activo) {
            Toast.makeText(this, "Ganaste", Toast.LENGTH_LONG).show();
            activo = false;
        }

        return true;
    }



    private void disponerBombas() {//Se encaraga de colocar las bomas de manera aleatoria en el tablero
        int cantidad = 8;
        do {
            int fila = (int) (Math.random() * 8);
            int columna = (int) (Math.random() * 8);
            if (fondo.getCasillas()[fila][columna].contenido == 0) {
                fondo.getCasillas()[fila][columna].contenido = 80;
                cantidad--;
            }
        } while (cantidad != 0);
    }

    private boolean gano() {//Se encarga de comprobar que se ha ganado
        int cant = 0;
        for (int f = 0; f < 8; f++)
            for (int c = 0; c < 8; c++)
                if (fondo.getCasillas()[f][c].destapado)
                    cant++;
        if (cant == 56)
            return true;
        else
            return false;
    }

    private void contarBombasPerimetro() {//Se encarga de poner un valor a las casillas cercanas a las bombas
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {
                if (fondo.getCasillas()[f][c].contenido == 0) {
                    int cant = contarCoordenada(f, c);
                    fondo.getCasillas()[f][c].contenido = cant;
                }
            }
        }
    }

    int contarCoordenada(int fila, int columna) {//Se encaraga de obtener las sumas de los numeros cercanos a las bombas
        int total = 0;
        if (fila - 1 >= 0 && columna - 1 >= 0) {
            if (fondo.getCasillas()[fila - 1][columna - 1].contenido == 80)
                total++;
        }
        if (fila - 1 >= 0) {
            if (fondo.getCasillas()[fila - 1][columna].contenido == 80)
                total++;
        }
        if (fila - 1 >= 0 && columna + 1 < 8) {
            if (fondo.getCasillas()[fila - 1][columna + 1].contenido == 80)
                total++;
        }

        if (columna + 1 < 8) {
            if (fondo.getCasillas()[fila][columna + 1].contenido == 80)
                total++;
        }
        if (fila + 1 < 8 && columna + 1 < 8) {
            if (fondo.getCasillas()[fila + 1][columna + 1].contenido == 80)
                total++;
        }

        if (fila + 1 < 8) {
            if (fondo.getCasillas()[fila + 1][columna].contenido == 80)
                total++;
        }
        if (fila + 1 < 8 && columna - 1 >= 0) {
            if (fondo.getCasillas()[fila + 1][columna - 1].contenido == 80)
                total++;
        }
        if (columna - 1 >= 0) {
            if (fondo.getCasillas()[fila][columna - 1].contenido == 80)
                total++;
        }
        return total;
    }

    private void recorrer(int fil, int col) {//Recorre el tablero y lo actualiza acada vez que se seleccione una casilla la destapa
        if (fil >= 0 && fil < 8 && col >= 0 && col < 8) {
            if (fondo.getCasillas()[fil][col].contenido == 0) {
                fondo.getCasillas()[fil][col].destapado = true;
                fondo.getCasillas()[fil][col].contenido = 50;
                recorrer(fil, col + 1);
                recorrer(fil, col - 1);
                recorrer(fil + 1, col);
                recorrer(fil - 1, col);
                recorrer(fil - 1, col - 1);
                recorrer(fil - 1, col + 1);
                recorrer(fil + 1, col + 1);
                recorrer(fil + 1, col - 1);
            } else if (fondo.getCasillas()[fil][col].contenido >= 1
                    && fondo.getCasillas()[fil][col].contenido <= 8) {
                fondo.getCasillas()[fil][col].destapado = true;
            }
        }
    }
}