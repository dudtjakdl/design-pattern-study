package patterns.creational.abstract_factory.chpark;

import patterns.creational.abstract_factory.chpark.audi.AudiCarFactory;
import patterns.creational.abstract_factory.chpark.bmw.BMWCarFactory;
import patterns.creational.abstract_factory.chpark.genesis.GenesisCarFactory;
import patterns.creational.abstract_factory.chpark.hyundai.HyundaiCarFactory;
import patterns.creational.abstract_factory.chpark.kia.KiaCarFactory;
import patterns.creational.abstract_factory.chpark.mercedes.MercedesCarFactory;
import patterns.creational.abstract_factory.chpark.porsche.PorscheCarFactory;

/**
 * 추상 팩토리 패턴 예제
 * 각 브랜드 팩토리가 관련된 객체들(차량정보, 엔진)을 함께 생성하는 것을 보여줌
 */
public class AbstractFactoryExample {
    public static void main(String[] args) {
        System.out.println("=== 추상 팩토리 패턴 예제 ===\n");

        // 현대 차량 생성
        System.out.println("1. 현대 차량 생성");
        createCar(new HyundaiCarFactory(), "소나타", 2024, "울산 공장");
        System.out.println();

        // 기아 차량 생성
        System.out.println("2. 기아 차량 생성");
        createCar(new KiaCarFactory(), "K5", 2024, "화성 공장");
        System.out.println();

        // 제네시스 차량 생성
        System.out.println("3. 제네시스 차량 생성");
        createCar(new GenesisCarFactory(), "G90", 2024, "전주 공장");
        System.out.println();

        // BMW 차량 생성
        System.out.println("4. BMW 차량 생성");
        createCar(new BMWCarFactory(), "3 Series", 2024, "뮌헨 공장");
        System.out.println();

        // 벤츠 차량 생성
        System.out.println("5. 벤츠 차량 생성");
        createCar(new MercedesCarFactory(), "E-Class", 2024, "슈투트가르트 공장");
        System.out.println();

        // 아우디 차량 생성
        System.out.println("6. 아우디 차량 생성");
        createCar(new AudiCarFactory(), "A6", 2024, "인골슈타트 공장");
        System.out.println();

        // 포르쉐 차량 생성
        System.out.println("7. 포르쉐 차량 생성");
        createCar(new PorscheCarFactory(), "911", 2024, "슈투트가르트 공장");
    }

    /**
     * 추상 팩토리를 사용하여 브랜드별로 일관된 관련 객체들을 함께 생성
     * 이것이 추상 팩토리 패턴의 핵심: 하나의 팩토리가 여러 관련 객체의 집합을 생성
     */
    private static void createCar(CarFactory factory, String modelName, int year, String factoryLocation) {
        // 하나의 팩토리가 관련된 모든 객체들을 함께 생성
        VehicleInfo vehicleInfo = factory.createVehicleInfo(modelName, year, factoryLocation);
        Engine engine = factory.createEngine();

        // 생성된 객체들 출력
        vehicleInfo.displayInfo();
        System.out.println();
        engine.start();
    }
}

