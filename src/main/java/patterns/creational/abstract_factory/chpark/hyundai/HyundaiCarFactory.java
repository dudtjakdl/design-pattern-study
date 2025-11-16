package patterns.creational.abstract_factory.chpark.hyundai;

import patterns.creational.abstract_factory.chpark.*;

public class HyundaiCarFactory implements CarFactory {
    @Override
    public VehicleInfo createVehicleInfo(String modelName, int productionYear, String factory) {
        return new HyundaiVehicleInfo(modelName, productionYear, factory);
    }

    @Override
    public Engine createEngine() {
        return new HyundaiEngine();
    }
}

