package patterns.creational.factory_method.kimys;

import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {

    public static void main(String[] args) {
        // 팩토리 메소드 자바 적용 에시
        // 자바에서 기본으로 제공하는 Calendar 클래스, 로케일 정보를 넘겨주면 각 정보에 맞는 구체적인 타입 반환
        // 그외 NumberFormat 도 팩토리 메소드 형식
        System.out.println(Calendar.getInstance().getClass()); // default
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());

        // 스프링에서의 팩토리 메소드 패턴 예제는 BeanFactory 를 예시로 잡을 수 있음
    }
}
