package fr.umontpellier.iut.partie1;

import java.util.ArrayList;

public class Couple {

    private Taquin jeuPuzzle;
    private Couple predecesseur;

    public Couple(Taquin jeuPuzzle, Couple predecesseur) {
        this.jeuPuzzle = jeuPuzzle;
        this.predecesseur = predecesseur;
    }

    public static void mettreAJour(Couple c, ArrayList<Couple> frontiere, ArrayList<Taquin> fils, ArrayList<Taquin> dejaVus) {
        throw new RuntimeException("Méthode non-implémentée");
    }

    public ArrayList<Taquin> getListeDeMouvements() {
        throw new RuntimeException("Méthode non-implémentée");
    }


}
