package patterns.creational.abstract_factory.kimys;

import patterns.creational.factory_method.kimys.Ship;
import patterns.creational.factory_method.kimys.ShipFactory;
import patterns.creational.factory_method.kimys.WhiteShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
