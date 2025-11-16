package patterns.creational.abstract_factory.chpark.hyundai;

import patterns.creational.abstract_factory.chpark.VehicleInfo;

public class HyundaiVehicleInfo extends VehicleInfo {
    public HyundaiVehicleInfo(String modelName, int productionYear, String factory) {
        super(modelName, productionYear, factory, "현대");
    }

    @Override
    public void displayInfo() {
        System.out.println("=== 현대 차량 정보 ===");
        System.out.println("브랜드: " + brand);
        System.out.println("모델명: " + modelName);
        System.out.println("생산연도: " + productionYear);
        System.out.println("생산지: " + factory);
    }
}

