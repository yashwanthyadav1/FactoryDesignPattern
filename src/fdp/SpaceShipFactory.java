package fdp;

public class SpaceShipFactory {
    public SpaceShip makeSpaceShip(String shipType){
        SpaceShip newShip=null;
        if(shipType.equals("U")){
            return new UFOSpaceShip();
        }
        else if (shipType.equals("R")){
            return new RocketSpaceShip();
        }
        else if (shipType.equals("M")){
            return new MegaSpaceShip();
        }
        else return null;
    }
}
