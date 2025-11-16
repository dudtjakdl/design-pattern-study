package patterns.creational.factory_method.chpark;

/**
 * ConcreteCreator 역할
 * 제네시스 자동차를 생성하는 팩토리
 */
public class GenesisCarFactory implements CarFactory {
    private static final String BRAND = "제네시스";

    @Override
    public Car createCar(String carName, int productionYear, String carCode, String userName) {
        CarInfo carInfo = new CarInfo(BRAND, carName, productionYear, carCode, userName);
        Car car = new GenesisCar(carInfo);
        
        // default 메소드로 제공되는 공통 기능 사용
        if (car.validateCarInfo()) {
            car.logCreation();
        }
        
        return car;
    }
}

