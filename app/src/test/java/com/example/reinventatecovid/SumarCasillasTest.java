package com.example.reinventatecovid;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumarCasillasTest {
    @Test
    public void suma_isCorrect() {
        Casilla A = new Casilla();
        A.fijarxy(1,1,1);
        Casilla B = new Casilla();
        B.fijarxy(2,2,1);
        Casilla C = new Casilla();
        C.fijarxy(3,3,1);
        Casilla NuevaCasilla = Casilla.suma(A,B);
        Assert.assertEquals(C.x, NuevaCasilla.x,0);
        Assert.assertEquals(C.y, NuevaCasilla.y,0);
    }
}
