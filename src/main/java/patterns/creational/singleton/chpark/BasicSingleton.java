package patterns.creational.singleton;

/**
 * 기본 싱글톤 패턴 구현 (Thread-Unsafe)
 * 멀티스레드 환경에서 안전하지 않음
 */
public class BasicSingleton {
    private static BasicSingleton instance;
    
    // private 생성자로 외부에서 직접 생성 방지
    private BasicSingleton() {
        System.out.println("BasicSingleton 인스턴스가 생성되었습니다.");
    }
    
    // static 메소드로 인스턴스 반환
    public static BasicSingleton getInstance() {
        if (instance == null) {
            instance = new BasicSingleton();
        }
        return instance;
    }
    
    public void doSomething() {
        System.out.println("BasicSingleton이 작업을 수행합니다.");
    }
}
