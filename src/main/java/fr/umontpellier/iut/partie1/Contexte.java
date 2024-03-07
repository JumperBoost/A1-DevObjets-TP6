package fr.umontpellier.iut.partie1;

import java.util.ArrayList;
import java.util.List;

public class Contexte {

    private final Taquin taquinInitial;
    private ArrayList<Taquin> solution;

    public Contexte(Taquin taquinInitial) {
        this.taquinInitial = taquinInitial;
        solution = new ArrayList<>();
    }

    public void resoudre() {
        ArrayList<Taquin> dejaVus = new ArrayList<>(List.of(taquinInitial));
        ArrayList<Couple> frontieres = new ArrayList<>(List.of(new Couple(taquinInitial, null)));
        ArrayList<Couple> frontieres_copy = new ArrayList<>();
        while (!frontieres.isEmpty()) {
            frontieres_copy.clear();
            frontieres_copy.addAll(frontieres);
            for (Couple couple : frontieres_copy) {
                if (couple.getTaquin().estGagnant()) {
                    solution = couple.getListeDeMouvements();
                    return;
                }
                frontieres.remove(couple);
                couple.mettreAJour(frontieres, dejaVus);
            }
        }
    }  // Résolution en file : exploration de l'arbre en largeur

    public ArrayList<Taquin> getSolution() {
        return solution;
    }

    public int getDistance() {
        return solution.size() - 1;
    }

    @Override
    public String toString() {
        String res = "";
        for(Taquin taquin : solution) {
            if(!res.isEmpty())
                res += "\n";
            res += taquin.toString();
        }
        return res;
    }
}
