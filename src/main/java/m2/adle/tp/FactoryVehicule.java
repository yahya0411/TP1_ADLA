package m2.adle.tp;

public class FactoryVehicule {

Vehicule creeVehicule(int choix)
{
    switch(choix)
    {
        case 1:
            return new Voiture();
        case 2:
            return new Bus();
        case 3:
            return new Bicyclette();
            case 4:
                return new Camion();
    }
    return null;


}

}
