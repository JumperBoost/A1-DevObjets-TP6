package fr.umontpellier.iut.partie2;


public class Sudoku {
    private int[][] grille;

    // pré-requis : la grille est carrée
    public Sudoku(int[][] g) {
        this.grille = g;
    }

    public boolean estGagnant() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }
}
