package patterns.creational.singleton;

/**
 * Enum을 사용한 싱글톤 패턴
 * 가장 안전하고 간단한 방법
 * 리플렉션과 직렬화에 안전함
 */
public enum EnumSingleton {
    INSTANCE;
    
    // enum 생성자는 자동으로 private
    EnumSingleton() {
        System.out.println("EnumSingleton 인스턴스가 생성되었습니다.");
    }
    
    public void doSomething() {
        System.out.println("EnumSingleton이 작업을 수행합니다.");
    }
    
    // 추가 메소드들
    public String getValue() {
        return "Enum Singleton Value";
    }
}
