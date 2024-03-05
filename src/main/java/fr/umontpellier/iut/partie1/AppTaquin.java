package fr.umontpellier.iut.partie1;

public class AppTaquin {
    public static void main(String[] args) {
        int[][] tableau = new int[][] {{1, 4, 3, 12}, {11, 5, 13, 2}, {7, 14, 8, 9}, {10, 6, 0, 15}};
        Taquin taquin = new Taquin(tableau);
        System.out.println(taquin);
        System.out.println(taquin.estGagnant());
        System.out.println("Il y a " + taquin.genererFils().size() + " fils possibles pour ce taquin.");

        int[][] tableau2 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        Taquin taquin2 = new Taquin(tableau2);
        System.out.println(taquin2);
        System.out.println(taquin2.estGagnant());
        System.out.println("Il y a " + taquin2.genererFils().size() + " fils possibles pour ce taquin.");

        int[][] tableau3 = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
        Taquin taquin3 = new Taquin(tableau3);
        System.out.println(taquin3);
        System.out.println(taquin3.estGagnant());
        System.out.println("Il y a " + taquin3.genererFils().size() + " fils possibles pour ce taquin.");
    }
}
