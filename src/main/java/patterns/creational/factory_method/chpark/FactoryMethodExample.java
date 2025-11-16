package patterns.creational.factory_method.chpark;

/**
 * 팩토리 메소드 패턴 예제 실행 클래스
 */
public class FactoryMethodExample {

    public static void main(String[] args) {
        System.out.println("=== 팩토리 메소드 패턴 예제 ===\n");

        // 1. 현대 자동차 등록
        CarFactory hyundaiFactory = new HyundaiCarFactory();
        Car sonata = hyundaiFactory.createCar("쏘나타", 2023, "HD-1234", "홍길동");
        
        System.out.println("1. 현대 자동차 등록:");
        sonata.displayInfo();
        sonata.drive();
        System.out.println();

        // 2. 기아 자동차 등록
        CarFactory kiaFactory = new KiaCarFactory();
        Car k5 = kiaFactory.createCar("K5", 2024, "KI-5678", "김철수");
        
        System.out.println("2. 기아 자동차 등록:");
        k5.displayInfo();
        k5.drive();
        System.out.println();

        // 3. 제네시스 자동차 등록
        CarFactory genesisFactory = new GenesisCarFactory();
        Car gv80 = genesisFactory.createCar("GV80", 2023, "GN-9012", "이영희");
        
        System.out.println("3. 제네시스 자동차 등록:");
        gv80.displayInfo();
        gv80.drive();
        System.out.println();

        // 팩토리 메소드 패턴의 장점:
        // - 클라이언트는 구체적인 Car 구현체를 직접 알 필요가 없음
        // - 각 브랜드별 팩토리를 통해 적절한 Car 객체를 생성
        // - 새로운 브랜드 추가 시 CarFactory를 구현하기만 하면 됨 (확장성)
        
        System.out.println("\n=== Java 8 default 메소드 활용 ===");
        // Car 인터페이스의 default 메소드 직접 사용
        System.out.println("\n쏘나타 브랜드: " + sonata.getBrand());
        System.out.println("K5 브랜드: " + k5.getBrand());
        System.out.println("GV80 브랜드: " + gv80.getBrand());
    }
}

