package patterns.creational.abstract_factory.chpark.porsche;

import patterns.creational.abstract_factory.chpark.Engine;

public class PorscheEngine extends Engine {
    public PorscheEngine() {
        super("포르쉐", "수평대향 6기통 엔진");
    }

    @Override
    public void start() {
        System.out.println("포르쉐 6기통 엔진이 시동되었습니다.");
    }
}

