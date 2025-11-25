package patterns.creational.singleton.kimys;

public class Settings {

    private static volatile Settings instance;

    // new 사용하여 인스턴스 생성 못하게 막음
    private Settings() {}

    // 글로벌 액세스가 가능하게 static 으로 인스턴스 제공
    // 멀티스레드 환경에서 안전한가..? 안전하지 않음
//    public static Settings getInstance() {
//        if (instance == null) {
//            instance = new Settings();
//        }
//
//        return instance;
//    }
    /*
        멀티스레드 고려한 구현 방법
        1. synchronized 키워드 사용하기 -> 성능상 단점이 있음
        2. 이른 초기화 : private static final Settings instance = new new Settings();
            쓰지 않으면 비용 낭비인게 단점
        3. double checked locking : 아래 방법
     */
    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }

    /*
         4.  static inner 클래스 사용하기 : 아래 방법 (권장)
     */
//    private static class SettingsHolder {
//        private static final Settings INSTANCE = new Settings();
//    }
//
//    public static Settings getInstance() {
//        return SettingsHolder.INSTANCE;
//    }
}
