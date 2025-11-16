package patterns.creational.abstract_factory.chpark.porsche;

import patterns.creational.abstract_factory.chpark.*;

public class PorscheCarFactory implements CarFactory {
    @Override
    public VehicleInfo createVehicleInfo(String modelName, int productionYear, String factory) {
        return new PorscheVehicleInfo(modelName, productionYear, factory);
    }

    @Override
    public Engine createEngine() {
        return new PorscheEngine();
    }
}

