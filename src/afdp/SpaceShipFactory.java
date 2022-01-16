package afdp;

public class SpaceShipFactory{
    private SpaceShipFactory(){

    }
    public static SpaceShip getSpaceShip(AbstractSpaceShipFactory abstractSpaceShipFactory) {
        return abstractSpaceShipFactory.createSpaceShip();
    }


}
