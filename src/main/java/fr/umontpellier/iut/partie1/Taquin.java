package fr.umontpellier.iut.partie1;

import java.util.ArrayList;

public class Taquin {
    private final int[][] tableau;

    public Taquin(int[][] tableau) {
        this.tableau = tableau;
    }

    /**
     * @return true si le Taquin courant est dans une configuration gagnante
     */
    public boolean estGagnant() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    /**
     * @return la liste des configurations obtenues avec un seul mouvement
     * à partir du Taquin courant
     */
    public ArrayList<Taquin> genererFils() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    /**
     * @return un tableau [i,j] si tableau[i][j]==0
     */
    public int[] trouverTrou() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }
}
