package patterns.creational.abstract_factory.chpark.bmw;

import patterns.creational.abstract_factory.chpark.Engine;

public class BMWEngine extends Engine {
    public BMWEngine() {
        super("BMW", "트윈파워 터보 엔진");
    }

    @Override
    public void start() {
        System.out.println("BMW 트윈파워 터보 엔진이 시동되었습니다.");
    }
}

