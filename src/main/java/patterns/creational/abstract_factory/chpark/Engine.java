package patterns.creational.abstract_factory.chpark;

/**
 * 엔진 추상 클래스
 */
public abstract class Engine {
    protected String brand;
    protected String engineType;

    public Engine(String brand, String engineType) {
        this.brand = brand;
        this.engineType = engineType;
    }

    public String getBrand() {
        return brand;
    }

    public String getEngineType() {
        return engineType;
    }

    public abstract void start();
}

