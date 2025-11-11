package patterns.creational.builder.kimys;

public class StringBuilderExample {

    public static void main(String[] args) {
        // 자바의 StringBuilder 사용 예제
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteship").append("keesun").toString();
        System.out.println(result);
    }
}
