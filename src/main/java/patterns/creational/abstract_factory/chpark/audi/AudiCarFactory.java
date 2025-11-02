package patterns.creational.abstract_factory.chpark.audi;

import patterns.creational.abstract_factory.chpark.*;

public class AudiCarFactory implements CarFactory {
    @Override
    public VehicleInfo createVehicleInfo(String modelName, int productionYear, String factory) {
        return new AudiVehicleInfo(modelName, productionYear, factory);
    }

    @Override
    public Engine createEngine() {
        return new AudiEngine();
    }
}

