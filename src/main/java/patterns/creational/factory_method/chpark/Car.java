package patterns.creational.factory_method.chpark;

/**
 * Product 역할
 * 자동차를 나타내는 인터페이스
 * Java 8의 default 메소드를 활용하여 공통 기능 제공
 */
public interface Car {
    CarInfo getCarInfo();
    void displayInfo();
    void drive();
    
    /**
     * Java 8 default 메소드 - 자동차 생성 시 로깅
     * 모든 Car 구현체에서 자동으로 사용 가능
     */
    default void logCreation() {
        CarInfo info = getCarInfo();
        System.out.println(String.format("[시스템 로그] %s 브랜드 차량 등록됨: %s (코드: %s)",
                info.getBrand(), info.getCarName(), info.getCarCode()));
    }
    
    /**
     * Java 8 default 메소드 - 차량 정보 검증
     * 기본 검증 로직 제공, 필요시 오버라이드 가능
     */
    default boolean validateCarInfo() {
        CarInfo info = getCarInfo();
        if (info.getCarName() == null || info.getCarName().isEmpty()) {
            System.out.println("오류: 차량명이 없습니다.");
            return false;
        }
        if (info.getCarCode() == null || info.getCarCode().isEmpty()) {
            System.out.println("오류: 차량코드가 없습니다.");
            return false;
        }
        if (info.getProductionYear() < 1900 || info.getProductionYear() > 2100) {
            System.out.println("오류: 생산연도가 유효하지 않습니다.");
            return false;
        }
        System.out.println("차량 정보 검증 완료: " + info.getCarName());
        return true;
    }
    
    /**
     * Java 8 default 메소드 - 브랜드 정보 반환
     */
    default String getBrand() {
        return getCarInfo().getBrand();
    }
}

