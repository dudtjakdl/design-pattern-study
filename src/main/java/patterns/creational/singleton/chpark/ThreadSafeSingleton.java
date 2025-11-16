package patterns.creational.singleton;

/**
 * 스레드 안전 싱글톤 패턴 구현
 * synchronized 키워드를 사용하여 멀티스레드 환경에서 안전
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton() {
        System.out.println("ThreadSafeSingleton 인스턴스가 생성되었습니다.");
    }
    
    // synchronized 메소드로 스레드 안전성 보장
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    
    public void doSomething() {
        System.out.println("ThreadSafeSingleton이 작업을 수행합니다.");
    }
}
