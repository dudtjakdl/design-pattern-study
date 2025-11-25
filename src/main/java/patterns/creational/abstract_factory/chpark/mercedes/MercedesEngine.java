package patterns.creational.abstract_factory.chpark.mercedes;

import patterns.creational.abstract_factory.chpark.Engine;

public class MercedesEngine extends Engine {
    public MercedesEngine() {
        super("벤츠", "AMG 엔진");
    }

    @Override
    public void start() {
        System.out.println("벤츠 엔진이 시동되었습니다.");
    }
}

