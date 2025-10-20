package patterns.creational.singleton;

/**
 * Double-Checked Locking 싱글톤 패턴
 * volatile 키워드와 이중 체크를 사용하여 성능과 안전성 모두 확보
 */
public class DoubleCheckedLockingSingleton {
    // volatile 키워드로 가시성 보장
    private static volatile DoubleCheckedLockingSingleton instance;
    
    private DoubleCheckedLockingSingleton() {
        System.out.println("DoubleCheckedLockingSingleton 인스턴스가 생성되었습니다.");
    }
    
    public static DoubleCheckedLockingSingleton getInstance() {
        // 첫 번째 체크 (동기화 없이)
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                // 두 번째 체크 (동기화 블록 내부에서)
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
    
    public void doSomething() {
        System.out.println("DoubleCheckedLockingSingleton이 작업을 수행합니다.");
    }
}
