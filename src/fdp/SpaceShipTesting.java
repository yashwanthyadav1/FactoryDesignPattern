package fdp;

import java.util.Scanner;

public class SpaceShipTesting {
    public static void main(String[] args){
        SpaceShipFactory shipFactory=new SpaceShipFactory();
        SpaceShip ship1=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose U for UFOShip, R for RocketShip ,M for MegaShip : -");
        String userInput=sc.nextLine();
        ship1=shipFactory.makeSpaceShip(userInput);
        ship1.attack();
        ship1.spectate();

    }
}
