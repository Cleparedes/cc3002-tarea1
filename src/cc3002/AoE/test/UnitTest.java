package cc3002.AoE.test;

import cc3002.AoE.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {
    private InfantryUnit IU;
    private ArcheryUnit AU;
    private CavalryUnit CU;
    private SiegeUnit SU;
    private Villager V;
    private Monk M;
    private int c;

    @Before
    public void setUp(){
        IU = new InfantryUnit(100, 10);
        AU = new ArcheryUnit(50, 20);
        CU = new CavalryUnit(100, 20);
        SU = new SiegeUnit(300, 30);
        V = new Villager(20, 5);
        M = new Monk(10,5);
        c = 100;
    }

    @Test
    public void getHP() {
        assertEquals(100.0, IU.getHP(), 0);
    }

    @Test
    public void getAP() {
        assertEquals(10, IU.getAP());
    }

    @Test
    public void ataque(){
        IU.ataque(AU);
        assertEquals(38.0, AU.getHP(),0);
        while(c!=0){
            M.ataque(AU);
            c--;
        }
        assertEquals(100.0, AU.getHP(),0);
        CU.ataque(AU);
        assertEquals(70.0, AU.getHP(), 0);
        V.ataque(SU);
        assertEquals(302.5, SU.getHP(), 0);
        AU.ataque(M);
        assertEquals(0, M.getHP(),0);
    }

    @Test
    public void muerto(){
        AU.ataque(M);
        assertTrue(M.muerto());
        M.ataque(AU);
        assertEquals(50, AU.getHP(), 0);
    }
}