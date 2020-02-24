package fr.umontpellier.iut.partie1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CoupleTest {
    @Test
    public void test_couple_getListeDeMouvements() {
        int[][] data1 = {{1,2,3},{4,5,6},{7,8,0}};
        Taquin t1 = new Taquin(data1);

        int[][] data2 = {{1,2,3},{4,5,6},{7,0,8}};
        Taquin t2 = new Taquin(data2);

        Couple c2 = new Couple(t2,null);
        Couple c1 = new Couple(t1,c2);

        ArrayList<Taquin> res = c1.getListeDeMouvements();
        ArrayList<Taquin> res2 = new ArrayList<Taquin>();
        res2.add(t2);
        res2.add(t1);
        assertEquals(true,res.equals(res2));
    }

    @Test
    public void test_couple_mise_a_jour() {
        int[][] data = {{1,2,0},{4,5,3},{7,8,6}};
        Taquin t = new Taquin(data);
        ArrayList<Taquin> fils = t.genererFils();
        Couple c = new Couple(t,null);


        int[][] datafils1 = {{1,2,3},{4,5,0},{7,8,6}};
        Taquin fils1 = new Taquin(datafils1);
        ArrayList<Taquin> dejavu = new ArrayList<Taquin>();
        dejavu.add(fils1);

        ArrayList<Couple> fr = new ArrayList<>();

        Couple.mettreAJour(c,fr,fils,dejavu);
        assertEquals(true,fr.size()==1 && dejavu.size()==2);
    }
}