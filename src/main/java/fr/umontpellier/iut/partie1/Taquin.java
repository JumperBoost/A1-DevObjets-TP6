package fr.umontpellier.iut.partie1;

import java.util.ArrayList;

public class Taquin {
    private int[][] tableau;

    public Taquin(int[][] tableau) {
        this.tableau = tableau;
    }

    public boolean estGagnant() {
        throw new RuntimeException("Méthode non-implémentée");
    }

    public ArrayList<Taquin> genererFils() {
        throw new RuntimeException("Méthode non-implémentée");
    }

    //retourne un tableau [i,j] si tableau[i][j]==0
    public int[] trouverTrou() {
        throw new RuntimeException("Méthode non-implémentée");
    }

}
