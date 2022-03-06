package fr.umontpellier.iut.partie2;

public class Sudoku {

        private int[][] grille;

        public Sudoku(int[][] g) {
            assert (g.length == g[0].length); // grille carrée
            this.grille = g;
        }

        public int n2() {
            return grille.length;
        }

        public int n() { // Pseudo-accesseur à la taille du sudoku, égale à la taille des blocs
            return (int) Math.sqrt(n2());
        }



}
