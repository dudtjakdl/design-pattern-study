package patterns.creational.factory_method.chpark;

/**
 * Creator 역할
 * 자동차를 생성하는 팩토리 인터페이스
 */
public interface CarFactory {
    /**
     * 팩토리 메소드 - 자동차를 생성
     * @param carName 차량명
     * @param productionYear 생산연도
     * @param carCode 차량코드
     * @param userName 사용자명
     * @return 생성된 자동차 객체
     */
    Car createCar(String carName, int productionYear, String carCode, String userName);
}

