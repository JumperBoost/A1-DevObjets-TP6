package fr.umontpellier.iut.partie2;

import fr.umontpellier.iut.partie1.Contexte;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.OutputStream;
import java.io.PrintStream;
import java.time.Duration;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContexteTest {

    @BeforeEach
    void disableConsole() {
        System.setOut(new PrintStream(new OutputStream() {
            @Override
            public void write(int arg0) {
            }
        }));

    }

    public static int[][] grille_sudoku22_incomplete2 () { //e
        int[][] g = {
                {4, 1, 2, 3},
                {0, 0, 1, 4},
                {0, 3, 4, 1},
                {1, 4, 3, 2}
        };
        return g;
    }

    static int[][] grille_sudoku22_gagnante () { //e
        int[][] g = {
                {4, 1, 2, 3},
                {3, 2, 1, 4},
                {2, 3, 4, 1},
                {1, 4, 3, 2} };
        return g;
    }

    @Disabled
    @Test
    public void test_resolution_sudoku2() {
        assertTimeoutPreemptively(Duration.ofSeconds(10), () -> {
            Sudoku sudoku = new Sudoku(grille_sudoku22_incomplete2 ());
            Sudoku sudokuSolution = new Sudoku(grille_sudoku22_gagnante ());
            Contexte contexte = new Contexte(sudoku);
            contexte.resoudre();
            ArrayList<JeuPuzzle> solution = contexte.getSolution();
            assertTrue(solution.size() == 4);
            assertTrue(solution.get(solution.size() - 1).equals(sudokuSolution) );
            assertTrue(solution.get(solution.size() - 1).estGagnant());
        });
    }
}
