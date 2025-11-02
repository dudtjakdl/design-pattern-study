package patterns.creational.abstract_factory.chpark.genesis;

import patterns.creational.abstract_factory.chpark.Engine;

public class GenesisEngine extends Engine {
    public GenesisEngine() {
        super("제네시스", "람다 V6 엔진");
    }

    @Override
    public void start() {
        System.out.println("제네시스 엔진이 시동되었습니다.");
    }
}

