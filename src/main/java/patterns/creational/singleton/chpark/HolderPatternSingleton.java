package patterns.creational.singleton;

/**
 * Initialization-on-demand holder 패턴
 * 내부 정적 클래스를 사용한 지연 초기화 싱글톤
 * 가장 권장되는 방법 중 하나
 */
public class HolderPatternSingleton {
    
    private HolderPatternSingleton() {
        System.out.println("HolderPatternSingleton 인스턴스가 생성되었습니다.");
    }
    
    // 내부 정적 클래스
    private static class SingletonHolder {
        private static final HolderPatternSingleton INSTANCE = new HolderPatternSingleton();
    }
    
    public static HolderPatternSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    public void doSomething() {
        System.out.println("HolderPatternSingleton이 작업을 수행합니다.");
    }
}
