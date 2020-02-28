package fr.umontpellier.iut.partie1;

import java.util.ArrayList;

public class Couple {

    private Taquin taquin;
    private Couple predecesseur;

    public Couple(Taquin taquin, Couple predecesseur) {
        this.taquin = taquin;
        this.predecesseur = predecesseur;
    }

    public void mettreAJour(ArrayList<Couple> frontiere, ArrayList<Taquin> dejaVus) {
        throw new RuntimeException("Méthode non-implémentée");
    }

    public ArrayList<Taquin> getListeDeMouvements() {
        throw new RuntimeException("Méthode non-implémentée");
    }


}
