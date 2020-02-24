package fr.umontpellier.iut;

public class Contexte {

    private Taquin Taquin;
    private ArrayList<Taquin> solution;

    public Contexte(Taquin Taquin) {
        this.Taquin = Taquin;
        solution = new ArrayList<>();
    }
    public void resoudre() {
        throw new RuntimeException("Méthode non-implémentée");
    }

    public ArrayList<Taquin> getSolution() {
        return solution;
    }
}
