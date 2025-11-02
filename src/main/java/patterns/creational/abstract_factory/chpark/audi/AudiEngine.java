package patterns.creational.abstract_factory.chpark.audi;

import patterns.creational.abstract_factory.chpark.Engine;

public class AudiEngine extends Engine {
    public AudiEngine() {
        super("아우디", "TFSI 터보 엔진");
    }

    @Override
    public void start() {
        System.out.println("아우디 엔진이 시동되었습니다.");
    }
}

