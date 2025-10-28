package patterns.creational.factory_method.chpark;

/**
 * ConcreteProduct 역할
 * 기아 자동차를 나타내는 클래스
 */
public class KiaCar implements Car {
    private CarInfo carInfo;

    public KiaCar(CarInfo carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public CarInfo getCarInfo() {
        return carInfo;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== 기아 자동차 정보 ===");
        System.out.println(carInfo.toString());
        System.out.println("기아자동차의 모빌리티 서비스가 제공됩니다.");
    }

    @Override
    public void drive() {
        System.out.println(carInfo.getCarName() + "를 운행합니다.");
    }
}

