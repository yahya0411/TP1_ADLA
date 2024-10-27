package m2.adle.tp;

public class Fabrique2D extends FabriqueJoueur{
    @Override
    Joueur createGardient() {
        return new Gardien2D();
    }

    @Override
    Joueur createArriere() {
        return new Arriere2D();
    }

    @Override
    Joueur createAvant() {
        return new Avant2D();
    }

    @Override
    Joueur createDemi() {
        return new Demi2D();
    }

    @Override
    Joueur createRobot() {
        return new Robo2D();
    }
}
