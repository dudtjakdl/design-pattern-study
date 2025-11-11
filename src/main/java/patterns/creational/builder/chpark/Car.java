package patterns.creational.builder.chpark;

import java.util.Objects;

/**
 * 자동차 주문을 위한 빌더 패턴 예제.
 * 필수 옵션은 브랜드이며, 나머지 옵션은 선택적으로 조합할 수 있다.
 */
public class Car {

    public enum Brand {
        HYUNDAI,
        KIA,
        GENESIS
    }

    public enum Engine {
        GASOLINE,
        DIESEL,
        ELECTRIC
    }

    public enum Color {
        WHITE,
        BLACK,
        BLUE,
        RED
    }

    public enum Interior {
        FABRIC,
        LEATHER,
        SUEDE
    }

    public enum Wheel {
        STANDARD,
        SPORT,
        OFFROAD
    }

    private final Brand brand;
    private final Engine engine;
    private final Color color;
    private final Interior interior;
    private final Wheel wheel;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.engine = builder.engine;
        this.color = builder.color;
        this.interior = builder.interior;
        this.wheel = builder.wheel;
    }

    public Brand getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public Color getColor() {
        return color;
    }

    public Interior getInterior() {
        return interior;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public static Builder builder(Brand brand) {
        return new Builder(brand);
    }

    /**
     * 자동차 옵션을 설정하기 위한 빌더.
     * 브랜드는 반드시 지정해야 하며, 그 외 옵션은 필요에 따라 선택한다.
     */
    public static class Builder {
        private final Brand brand;
        private Engine engine = Engine.GASOLINE;
        private Color color = Color.WHITE;
        private Interior interior = Interior.FABRIC;
        private Wheel wheel = Wheel.STANDARD;

        private Builder(Brand brand) {
            this.brand = Objects.requireNonNull(brand, "brand must not be null");
        }

        public Builder engine(Engine engine) {
            this.engine = Objects.requireNonNull(engine, "engine must not be null");
            return this;
        }

        public Builder color(Color color) {
            this.color = Objects.requireNonNull(color, "color must not be null");
            return this;
        }

        public Builder interior(Interior interior) {
            this.interior = Objects.requireNonNull(interior, "interior must not be null");
            return this;
        }

        public Builder wheel(Wheel wheel) {
            this.wheel = Objects.requireNonNull(wheel, "wheel must not be null");
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
            "brand=" + brand +
            ", engine=" + engine +
            ", color=" + color +
            ", interior=" + interior +
            ", wheel=" + wheel +
            '}';
    }
}

