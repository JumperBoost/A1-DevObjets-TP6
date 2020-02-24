package fr.umontpellier.iut.partie2;

import java.util.ArrayList;

public class Hanoi {
    public Hanoi(int taille) {
        //créé un hanoi avec, sur la tour 1 les disques [taille,taille-1, .., 1], et les tour 2 et 3 vides
    }



    public Hanoi(ArrayList<Integer> tour1, ArrayList<Integer> tour2, ArrayList<Integer> tour3, int taille) {
        //créé un hanoi où la tour 1 contient les entiers de tour1 , et pareil pour 2 et 3
        //par exemple, avec tour1 une arrayList contenant [3,2,1], et tour2 et tour3 des arrayList vides,
        //Hanoi(tour1, tour2, tour3) doit créer la même configuration que Hanoi(3)
    }


}
