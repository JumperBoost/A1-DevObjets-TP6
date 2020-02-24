package fr.umontpellier.iut;

import java.util.ArrayList;

public class Couple {

    private Taquin jeuPuzzle;
    private Couple predecesseur;

    public Couple(Taquin jeuPuzzle, Couple predecesseur) {
        this.jeuPuzzle = jeuPuzzle;
        this.predecesseur = predecesseur;
    }
    public ArrayList<Taquin> getListeDeMouvements() {
        throw new RuntimeException("Méthode non-implémentée");
    }

    public static void mettreAJour(Couple c, ArrayList<Couple> frontiere, ArrayList<Taquin> tab, ArrayList<Taquin> dejaVus) {
        throw new RuntimeException("Méthode non-implémentée");
    }


}
