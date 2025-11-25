package patterns.creational.abstract_factory.chpark.bmw;

import patterns.creational.abstract_factory.chpark.VehicleInfo;

public class BMWVehicleInfo extends VehicleInfo {
    public BMWVehicleInfo(String modelName, int productionYear, String factory) {
        super(modelName, productionYear, factory, "BMW");
    }

    @Override
    public void displayInfo() {
        System.out.println("=== BMW 차량 정보 ===");
        System.out.println("브랜드: " + brand);
        System.out.println("모델명: " + modelName);
        System.out.println("생산연도: " + productionYear);
        System.out.println("생산지: " + factory);
    }
}

