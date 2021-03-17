package com.example.reinventatecovid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;

class Tablero extends View {

    private Casilla[][] casillas;

    public Tablero(Context context) {
        super(context);
    }//constructor

    protected void onDraw(Canvas canvas) {//Dibuja el tablero
        canvas.drawRGB(0, 0, 0);
        int ancho = 0;
        if (canvas.getWidth() < canvas.getHeight())
            ancho = this.getWidth();
        else
            ancho = this.getHeight();
        int anchocuadro = ancho / 8;
        Paint paint = new Paint();
        paint.setTextSize(50);
        Paint paint2 = new Paint();
        paint2.setTextSize(50);
        paint2.setTypeface(Typeface.DEFAULT_BOLD);
        paint2.setARGB(255, 0, 0, 255);
        Paint paintlinea1 = new Paint();
        paintlinea1.setARGB(255, 255, 255, 255);
        int filaActual = 0;
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {
                casillas[f][c].fijarxy(c * anchocuadro, filaActual, anchocuadro);
                if (casillas[f][c].destapado == false)
                    paint.setARGB(153, 204, 204, 204);
                else
                    paint.setARGB(255, 153, 153, 153);
                canvas.drawRect(c * anchocuadro, filaActual, c * anchocuadro
                        + anchocuadro - 2, filaActual + anchocuadro - 2, paint);//Se encarga de pintar un rectangulo
                // linea blanca
                canvas.drawLine(c * anchocuadro, filaActual, c * anchocuadro
                        + anchocuadro, filaActual, paintlinea1);//Pinta las separacioes entre los cuadrados de texto, pinta las lineas horizontales
                canvas.drawLine(c * anchocuadro + anchocuadro - 1, filaActual, c
                                * anchocuadro + anchocuadro - 1, filaActual + anchocuadro,
                        paintlinea1);//Pinta las separacioes entre los cuadrados de texto, pinta las lineas verticales

                if (casillas[f][c].contenido >= 1
                        && casillas[f][c].contenido <= 8
                        && casillas[f][c].destapado)//Se encarga de pintar el numero en el cuadrado en casode haber seleccionado un cuadrado sin bomba
                    canvas.drawText(
                            String.valueOf(casillas[f][c].contenido), c
                                    * anchocuadro + (anchocuadro / 2) - 8,
                            filaActual + anchocuadro / 2, paint2);


                if (casillas[f][c].contenido == 80
                        && casillas[f][c].destapado) {//Se encarga de pintar la bomba en el caso de que se destape una casilla con valor 80
                    Paint bomba = new Paint();
                    bomba.setARGB(255, 255, 0, 0);
                    canvas.drawCircle(c * anchocuadro + (anchocuadro / 2),
                            filaActual + (anchocuadro / 2), 8, bomba);
                }

            }
            filaActual = filaActual + anchocuadro;
        }
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }
}
