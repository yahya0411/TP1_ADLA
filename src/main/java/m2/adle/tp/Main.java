package m2.adle.tp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
        FactoryVehicule vehicule = new FactoryVehicule();

        int choix = 2;
        System.out.println(vehicule.creeVehicule(choix));



        List<Vehicule> parc = new ArrayList<Vehicule>();
        parc.add(vehicule.creeVehicule(1));
        parc.add(vehicule.creeVehicule(1));
        parc.add(vehicule.creeVehicule(1));
        parc.add(vehicule.creeVehicule(1));
        parc.add(vehicule.creeVehicule(1));
        parc.add(vehicule.creeVehicule(2));
        parc.add(vehicule.creeVehicule(2));
        parc.add(vehicule.creeVehicule(2));
        parc.add(vehicule.creeVehicule(3));
        parc.add(vehicule.creeVehicule(3));
        // camion
        parc.add(vehicule.creeVehicule(4));


        for (Vehicule v : parc) {
            System.out.println(v);
        }

*/

        FabriqueJoueur fabriqueJoueur = null;
        int choix = 1;

        Terrain mon_terrain = new Terrain();
        if (choix == 1) {
            fabriqueJoueur = new Fabrique2D();
        }
        else if (choix == 2) {
            fabriqueJoueur = new Fabrique3D();
        }

        mon_terrain.creerJoueur(fabriqueJoueur);


    }
}