package patterns.creational.abstract_factory.chpark.kia;

import patterns.creational.abstract_factory.chpark.*;

public class KiaCarFactory implements CarFactory {
    @Override
    public VehicleInfo createVehicleInfo(String modelName, int productionYear, String factory) {
        return new KiaVehicleInfo(modelName, productionYear, factory);
    }

    @Override
    public Engine createEngine() {
        return new KiaEngine();
    }
}

