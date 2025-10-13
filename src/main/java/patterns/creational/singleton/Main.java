package patterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 싱글톤 패턴 : 어떤 클래스의 인스턴스를 오직 한개만 만들어 제공하는 패턴
        // ex) 게임의 설정 화면

//        Settings settings = new Settings();
//        Settings settings1 = new Settings();
//        System.out.println(settings != settings1);

//        Settings settings = Settings.getInstance();
//        Settings settings1 = Settings.getInstance();
//        System.out.println(settings == settings1);

        Settings settings = Settings.getInstance();
        System.out.println(settings == Settings.getInstance());

        // 싱글톤 패턴이 깨지는 예시 1 : 리플렉션 사용 -> 해결 방법은 enum 클래스로 구현
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings1 = constructor.newInstance();
        System.out.println(settings == settings1);

        // 싱글톤 패턴이 깨지는 예시 2 : 직렬화&역직렬화 -> 해결 방법은 클래스 내에 readResolve 메서드를 구현하거나 enum 클래스로 구현
        // enum 클래스로 싱글톤 구현했을때 단점 : 상속을 쓰지 못함
        SettingsEnum settingsEnum = SettingsEnum.INSTANCE;
        SettingsEnum settingsEnum1 = SettingsEnum.INSTANCE;
        System.out.println(settingsEnum == settingsEnum1);


        // 자바&스프링 싱글톤 패턴 예시 1
        Runtime runtime = Runtime.getRuntime(); // thread safe
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println(runtime == runtime1);

        // 자바&스프링 싱글톤 패턴 예시 1 : 스프링에 ApplicationContext 클래스 getBean (빈의 스코프 중에 하나로 싱글톤 스코프)
    }
}