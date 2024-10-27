package m2.adle.tp;

public class Fabrique3D extends FabriqueJoueur{
    @Override
    Joueur createGardient() {
        return new Gardien3D();
    }

    @Override
    Joueur createArriere() {
        return new Arriere3D();
    }

    @Override
    Joueur createAvant() {
        return new Avant3D();
    }

    @Override
    Joueur createDemi() {
        return new Demi3D();
    }

    @Override
    Joueur createRobot() {
        return new Robo3D();
    }
}
