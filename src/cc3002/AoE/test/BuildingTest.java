package cc3002.AoE.test;

import cc3002.AoE.Barracks;
import cc3002.AoE.Castle;
import cc3002.AoE.Villager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuildingTest {
    private Castle C;
    private Castle C2;
    private Barracks B;
    private Villager V;
    private int c;

    @Before
    public void setUp(){
        C = new Castle(200, 30);
        C2 = new Castle(200, 500);
        B = new Barracks(200);
        V = new Villager(10, 30);
        c = 10;
    }

    @Test
    public void getHP() {
        assertEquals(200.0, C.getHP(), 0);
    }

    @Test
    public void muerto() {
        assertFalse(B.muerto());
        while(c!=0){
            C.ataque(B);
            c--;
        }
        assertTrue(B.muerto());
        V.ataque(B);
        assertTrue(B.muerto());
        C2.ataque(C);
        C.ataque(C2);
        assertEquals(200.0, C2.getHP(), 0);
    }

    @Test
    public void recibeDanno() {
        C.ataque(B);
        assertEquals(179.0, B.getHP(),0);
        V.ataque(B);
        assertEquals(200.0, B.getHP(),0);
        V.ataque(B);
        assertEquals(200.0, B.getHP(),0);
    }
}