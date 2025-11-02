package patterns.creational.abstract_factory.chpark.bmw;

import patterns.creational.abstract_factory.chpark.*;

public class BMWCarFactory implements CarFactory {
    @Override
    public VehicleInfo createVehicleInfo(String modelName, int productionYear, String factory) {
        return new BMWVehicleInfo(modelName, productionYear, factory);
    }

    @Override
    public Engine createEngine() {
        return new BMWEngine();
    }
}

