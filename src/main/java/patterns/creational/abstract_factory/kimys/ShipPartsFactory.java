package patterns.creational.abstract_factory.kimys;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}
