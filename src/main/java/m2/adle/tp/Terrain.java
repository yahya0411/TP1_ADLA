package m2.adle.tp;

import java.util.ArrayList;
import java.util.List;

public class Terrain {

    List<Joueur> joueurs = new ArrayList<Joueur>();


    void creerJoueur(FabriqueJoueur fabrique)
    {


            joueurs.add(fabrique.createGardient());
            joueurs.add(fabrique.createArriere());
            joueurs.add(fabrique.createAvant());
            joueurs.add(fabrique.createDemi());




    }
}
