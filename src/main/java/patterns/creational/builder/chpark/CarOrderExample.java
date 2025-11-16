package patterns.creational.builder.chpark;

/**
 * 자동차 주문 빌더 사용 예시.
 */
public class CarOrderExample {

    public static void main(String[] args) {
        Car genesis = Car.builder(Car.Brand.GENESIS)
            .engine(Car.Engine.GASOLINE)
            .color(Car.Color.BLACK)
            .interior(Car.Interior.LEATHER)
            .wheel(Car.Wheel.SPORT)
            .build();

        Car hyundai = Car.builder(Car.Brand.HYUNDAI)
            .engine(Car.Engine.ELECTRIC)
            .color(Car.Color.BLUE)
            .wheel(Car.Wheel.STANDARD)
            .build();

        Car kia = Car.builder(Car.Brand.KIA)
            .engine(Car.Engine.DIESEL)
            .color(Car.Color.RED)
            .interior(Car.Interior.SUEDE)
            .wheel(Car.Wheel.OFFROAD)
            .build();

        System.out.println("=== 자동차 주문 내역 ===");
        System.out.println(genesis);
        System.out.println(hyundai);
        System.out.println(kia);
    }
}

