package patterns.creational.abstract_factory.chpark;

/**
 * 추상 팩토리 인터페이스
 * 브랜드별로 관련된 자동차 컴포넌트들을 생성하는 메서드를 정의
 */
public interface CarFactory {
    VehicleInfo createVehicleInfo(String modelName, int productionYear, String factory);
    Engine createEngine();
}

