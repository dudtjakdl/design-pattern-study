package patterns.creational.abstract_factory.chpark.hyundai;

import patterns.creational.abstract_factory.chpark.Engine;

public class HyundaiEngine extends Engine {
    public HyundaiEngine() {
        super("현대", "세타 엔진");
    }

    @Override
    public void start() {
        System.out.println("현대 엔진이 시동되었습니다.");
    }
}

