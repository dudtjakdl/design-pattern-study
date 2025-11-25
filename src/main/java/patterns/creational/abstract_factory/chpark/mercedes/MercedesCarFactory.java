package patterns.creational.abstract_factory.chpark.mercedes;

import patterns.creational.abstract_factory.chpark.*;

public class MercedesCarFactory implements CarFactory {
    @Override
    public VehicleInfo createVehicleInfo(String modelName, int productionYear, String factory) {
        return new MercedesVehicleInfo(modelName, productionYear, factory);
    }

    @Override
    public Engine createEngine() {
        return new MercedesEngine();
    }
}

