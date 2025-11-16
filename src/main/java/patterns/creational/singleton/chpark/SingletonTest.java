package patterns.creational.singleton;

/**
 * 싱글톤 패턴 테스트 클래스
 * 다양한 싱글톤 구현 방법들을 테스트
 */
public class SingletonTest {
    
    public static void main(String[] args) {
        System.out.println("=== 싱글톤 패턴 테스트 시작 ===\n");
        
        // 1. 기본 싱글톤 테스트
        testBasicSingleton();
        
        // 2. 스레드 안전 싱글톤 테스트
        testThreadSafeSingleton();
        
        // 3. Double-Checked Locking 싱글톤 테스트
        testDoubleCheckedLockingSingleton();
        
        // 4. Holder Pattern 싱글톤 테스트
        testHolderPatternSingleton();
        
        // 5. Enum 싱글톤 테스트
        testEnumSingleton();
        
        // 6. 멀티스레드 환경에서의 싱글톤 테스트
        testMultiThreadSingleton();
        
        System.out.println("\n=== 싱글톤 패턴 테스트 완료 ===");
    }
    
    private static void testBasicSingleton() {
        System.out.println("1. 기본 싱글톤 테스트:");
        BasicSingleton instance1 = BasicSingleton.getInstance();
        BasicSingleton instance2 = BasicSingleton.getInstance();
        System.out.println("인스턴스 동일성: " + (instance1 == instance2));
        instance1.doSomething();
        System.out.println();
    }
    
    private static void testThreadSafeSingleton() {
        System.out.println("2. 스레드 안전 싱글톤 테스트:");
        ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
        System.out.println("인스턴스 동일성: " + (instance1 == instance2));
        instance1.doSomething();
        System.out.println();
    }
    
    private static void testDoubleCheckedLockingSingleton() {
        System.out.println("3. Double-Checked Locking 싱글톤 테스트:");
        DoubleCheckedLockingSingleton instance1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton instance2 = DoubleCheckedLockingSingleton.getInstance();
        System.out.println("인스턴스 동일성: " + (instance1 == instance2));
        instance1.doSomething();
        System.out.println();
    }
    
    private static void testHolderPatternSingleton() {
        System.out.println("4. Holder Pattern 싱글톤 테스트:");
        HolderPatternSingleton instance1 = HolderPatternSingleton.getInstance();
        HolderPatternSingleton instance2 = HolderPatternSingleton.getInstance();
        System.out.println("인스턴스 동일성: " + (instance1 == instance2));
        instance1.doSomething();
        System.out.println();
    }
    
    private static void testEnumSingleton() {
        System.out.println("5. Enum 싱글톤 테스트:");
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println("인스턴스 동일성: " + (instance1 == instance2));
        instance1.doSomething();
        System.out.println("값: " + instance1.getValue());
        System.out.println();
    }
    
    private static void testMultiThreadSingleton() {
        System.out.println("6. 멀티스레드 환경에서의 싱글톤 테스트:");
        
        // 여러 스레드에서 동시에 싱글톤 인스턴스 요청
        Thread[] threads = new Thread[5];
        
        for (int i = 0; i < threads.length; i++) {
            final int threadId = i;
            threads[i] = new Thread(() -> {
                HolderPatternSingleton instance = HolderPatternSingleton.getInstance();
                System.out.println("스레드 " + threadId + ": " + instance.hashCode());
            });
        }
        
        // 모든 스레드 시작
        for (Thread thread : threads) {
            thread.start();
        }
        
        // 모든 스레드 완료 대기
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        System.out.println();
    }
}
