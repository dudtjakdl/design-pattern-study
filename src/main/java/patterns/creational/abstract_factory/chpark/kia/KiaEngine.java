package patterns.creational.abstract_factory.chpark.kia;

import patterns.creational.abstract_factory.chpark.Engine;

public class KiaEngine extends Engine {
    public KiaEngine() {
        super("기아", "스마트스트림 엔진");
    }

    @Override
    public void start() {
        System.out.println("기아 엔진이 시동되었습니다.");
    }
}

