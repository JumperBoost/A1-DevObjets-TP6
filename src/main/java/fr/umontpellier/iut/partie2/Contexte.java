package fr.umontpellier.iut.partie2;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class Contexte {

    private final JeuPuzzle puzzle;
    private ArrayList<JeuPuzzle> solution;

    public Contexte(JeuPuzzle puzzle) {
        this.puzzle = puzzle;
        solution = new ArrayList<>();
    }

    public void resoudre() {
        ArrayList<JeuPuzzle> dejaVus = new ArrayList<>(List.of(puzzle));
        ArrayList<Couple> frontieres = new ArrayList<>(List.of(new Couple(puzzle, null)));
        ArrayList<Couple> frontieres_copy = new ArrayList<>();
        while (!frontieres.isEmpty()) {
            frontieres_copy.clear();
            frontieres_copy.addAll(frontieres);
            for (Couple couple : frontieres_copy) {
                if (couple.getPuzzle().estGagnant()) {
                    solution = couple.getListeDeMouvements();
                    return;
                }
                frontieres.remove(couple);
                couple.mettreAJour(frontieres, dejaVus);
            }
        }
    }  // Résolution en file : exploration de l'arbre en largeur

    public ArrayList<JeuPuzzle> getSolution() {
        return solution;
    }

    public int getDistance() {
        return solution.size() - 1;
    }

    @Override
    public String toString() {
        String res = "";
        for(JeuPuzzle puzzle : solution) {
            if(!res.isEmpty())
                res += "\n";
            res += puzzle.toString();
        }
        return res;
    }
}
