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
        ArrayList<Taquin> taquinsFils = taquin.genererFils();
        for(Taquin taquin : taquinsFils) {
            Couple couple_taquin = new Couple(taquin, this);
            // Ajouter si inexistant
            if(!dejaVus.contains(couple_taquin.taquin)) {
                frontiere.add(couple_taquin);
                dejaVus.add(couple_taquin.taquin);
            }
        }
    }

    /**
     * @return la liste des taquins intermédiaires à partir du taquin initial
     * et jusqu'au taquin courant
     */
    public ArrayList<Taquin> getListeDeMouvements() {
        ArrayList<Taquin> listeTaquins = new ArrayList<>();
        Couple couple = this;
        do {
            listeTaquins.add(0, couple.taquin);
            couple = couple.predecesseur;
        } while (couple != null);
        return listeTaquins;
    }

    public Taquin getTaquin() {
        return taquin;
    }
}
