package fr.umontpellier.iut.partie1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TaquinTest {
    @Test
    public void test_est_gagnant_faux() {
        int[][] data = {{1,2,0},{4,5,3},{7,8,6}};
        Taquin t = new Taquin(data);
        assertEquals(false,t.estGagnant());
    }



    @Test
    public void test_trouver_trou_coin_hd() {
        int[][] data = {{1,2,0},{4,5,3},{7,8,6}};
        Taquin t = new Taquin(data);
        int[] res = t.trouverTrou();
        int[] res2 = {0,2};
        assertArrayEquals(res2,res);
    }

    @Test
    public void test_equals_vrai() {
        int[][] data = {{1,2,0},{4,5,3},{7,8,6}};
        Taquin t = new Taquin(data);
        int[][] data2 = {{1,2,0},{4,5,3},{7,8,6}};
        Taquin t2 = new Taquin(data2);
        assertEquals(true,t.equals(t2));
    }


    @Test
    public void test_generer_Fils_coin() {
        int[][] data = {{1,2,0},{4,5,3},{7,8,6}};
        Taquin t = new Taquin(data);
        ArrayList<Taquin> res = t.genererFils();

        ArrayList<Taquin> res2 = new ArrayList<Taquin>();
        int[][] datafils1 = {{1,2,3},{4,5,0},{7,8,6}};
        Taquin fils1 = new Taquin(datafils1);
        int[][] datafils2 = {{1,0,2},{4,5,3},{7,8,6}};
        Taquin fils2 = new Taquin(datafils2);
        res2.add(fils1);
        res2.add(fils2);
        assertEquals(true,res.containsAll(res2) && res2.containsAll(res));
    }
}