package patterns.creational.builder.kimys;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
//        Stream.Builder<String> stringStreamBuilder = Stream.builder();
//        Stream<String> names = stringStreamBuilder.add("keesun").add("whiteship").build();
        // 위 코드를 제네릭타입 명시하여 아래와 같이 작성 가능
        Stream<String> names = Stream.<String>builder().add("keesun").add("whiteship").build();
        names.forEach(System.out::println);
    }
}
