package fr.umontpellier.iut.partie2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.OutputStream;
import java.io.PrintStream;
import java.time.Duration;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SudokuTest {
    @BeforeEach
    void disableConsole() {
        System.setOut(new PrintStream(new OutputStream() {
            @Override
            public void write(int arg0) {
            }
        }));

    }

    public static int[][] grille_sudoku22_incomplete2 () {
        int[][] g = {
                {4, 1, 2, 3},
                {0, 0, 1, 4},
                {0, 3, 4, 1},
                {1, 4, 3, 2}
        };
        return g;
    }

    static int[][] grille_sudoku22_gagnante () {
        int[][] g = {
                {4, 1, 2, 3},
                {3, 2, 1, 4},
                {2, 3, 4, 1},
                {1, 4, 3, 2} };
        return g;
    }

    static int[][] grille_sudoku_nongagnante_ligne () {
        int[][] g = {
                {4, 1, 2, 3},
                {3, 2, 1, 4},
                {2, 3, 4, 2},
                {1, 4, 3, 1} };
        return g;
    }

    @Disabled
    @Test
    public void test_sudoku22_est_gagnant_vrai() { //e
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {

            Sudoku sudoku = new Sudoku(grille_sudoku22_gagnante());
            assertTrue(sudoku.estGagnant());
        });
    }

    @Disabled
    @Test
    public void test_sudoku22_est_gagnant_faux_pbLignes() { //e
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {

            Sudoku sudoku = new Sudoku(grille_sudoku_nongagnante_ligne());
            assertFalse(sudoku.estGagnant());
        });
    }

    @Disabled
    @Test
    public void test_sudoku22_generer_4_fils() { //e
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            Sudoku sudoku = new Sudoku(grille_sudoku22_incomplete2());
            ArrayList<? extends JeuPuzzle> fils = sudoku.genererFils();
            assertEquals(fils.size(), 4);
        });
    }

}
