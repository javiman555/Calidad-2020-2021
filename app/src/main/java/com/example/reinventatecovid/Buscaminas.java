package com.example.reinventatecovid;


import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.util.Random;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Buscaminas extends AppCompatActivity implements View.OnTouchListener{
                        //ESTO ES UN BUG
    
    
/*           ⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ 
            ⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀ 
            ⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀ 
            ⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀ 
            ⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆ 
            ⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿ 
            ⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀ 
            ⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀ 
            ⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀ 
            ⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀ 
            ⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀ 
            ⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀ 
            ⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀ 
            ⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀ 
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉
*/
    
    
    private Tablero fondo; //Es el fondo donde se escenifica nuestro tablero de buscaminas
    private final Random r = new Random();

    private boolean activo = true;
    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setDecorFitsSystemWindows(false);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscaminas);

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);
        fondo = new Tablero(this);
        fondo.setOnTouchListener(this);
        layout.addView(fondo);

        fondo.setCasillas(new Casilla[8][8]);

        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {
                fondo.getCasillas()[f][c] = new Casilla();
            }
        }
        this.disponerBombas();
        this.contarBombasPerimetro();
        getSupportActionBar().hide();
    }

    public void reiniciar(View v) {// Se encarga de reiniciar el tablero del buscaminas reiniciando las casillas del tablero
        fondo.setCasillas(new Casilla[8][8]);
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
                    hayBomba(f,c,event);
                }
            }
        if (gano() && activo) {
            Toast.makeText(this, "Ganaste", Toast.LENGTH_LONG).show();
            activo = false;
        }

        return true;
    }

    private void hayBomba(int f, int c,MotionEvent event) {//Comprueba si el usuario ha tocado una bomba
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


    private void disponerBombas() {//Se encaraga de colocar las bomas de manera aleatoria en el tablero
        int cantidad = 8;
        do {
            int fila = r.nextInt(8);
            int columna = r.nextInt(8);
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
            return (cant == 56);
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
        int filamin = Math.max(fila - 1, 0);
        int filamax = Math.min(fila + 1, 8-1);
        int columnamin = Math.max(columna - 1, 0);
        int columnamax = Math.min(columna + 1, 8-1);

        if(fila != 0 && fila != 7){
            total =mirarCasilla(fila,columnamin,total);
            total =mirarCasilla(fila,columnamax,total);
        }
        if(columna != 0 && columna != 7){
            total =mirarCasilla(filamin,columna,total);
            total =mirarCasilla(filamax,columna,total);
        }
        total =mirarCasilla(filamin,columnamin,total);
        total =mirarCasilla(filamin,columnamax,total);
        total =mirarCasilla(filamax,columnamin,total);
        total =mirarCasilla(filamax,columnamax,total);

        return total;
    }

    private int mirarCasilla(int fila, int columna,int total) {//Combrueba si en una casilla hay una bomba
        if (fondo.getCasillas()[fila][columna].contenido == 80)
            total++;
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
