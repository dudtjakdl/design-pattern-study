package patterns.creational.factory_method.kimys;

public interface ShipFactory {
    // 기존 ShipFactory 가 하던 orderShip 메서드 정의
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);

        return ship;
    }

    // 배를 만드는 create 공정 메서드는 하위 클래스에서 정의
    Ship createShip();

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
    //    인터페이스 내 private 사용은 자바 9부터 가능
    //    -> 자바 8일 경우에는 DefaultShipFactorty 추상 클래스 선언하여 하나의 계층을 더 두고 해당 클래스에 선언
    void sendEmailTo(String email, Ship ship);
//    private void sendEmailTo(String email, Ship ship) {
//        System.out.println(ship.getName() + " 다 만들었습니다.");
//    }
}
