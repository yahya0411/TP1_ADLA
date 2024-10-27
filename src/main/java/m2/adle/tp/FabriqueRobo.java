package m2.adle.tp;

public class FabriqueRobo extends FabriqueJoueur{
    @Override
    Joueur createGardient() {
        return new RobotG();
    }

    @Override
    Joueur createArriere() {
        return new RobotArriere();
    }

    @Override
    Joueur createAvant() {
        return new RoboAvant();
    }

    @Override
    Joueur createDemi() {
        return new RobotDemi();
    }
}
