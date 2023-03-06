package fr.umontpellier.iut.partie1;

import java.util.ArrayList;

public class Couple {

    private final Taquin taquin;
    private Couple predecesseur;

    public Couple(Taquin taquin, Couple predecesseur) {
        this.taquin = taquin;
        this.predecesseur = predecesseur;
    }

    /**
     * Vérifie si les fils du taquin sont déjà vus et met à jour la frontière
     * et l'ensemble des configurations déjà vues.
     */
    public void mettreAJour(ArrayList<Couple> frontiere, ArrayList<Taquin> dejaVus) {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    /**
     * @return la liste des taquins intermédiaire à partir du taquin initial
     * et jusqu'au taquin courant
     */
    public ArrayList<Taquin> getListeDeMouvements() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    public Taquin getTaquin() {
        return taquin;
    }
}
