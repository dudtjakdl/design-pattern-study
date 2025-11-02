package patterns.creational.abstract_factory.chpark;

/**
 * 차량 정보 추상 클래스
 * 실질적인 관리 정보: 차량모델명, 생산연도, 생산지(공장)
 */
public abstract class VehicleInfo {
    protected String modelName;
    protected int productionYear;
    protected String factory;
    protected String brand;

    public VehicleInfo(String modelName, int productionYear, String factory, String brand) {
        this.modelName = modelName;
        this.productionYear = productionYear;
        this.factory = factory;
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getFactory() {
        return factory;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void displayInfo();
}

