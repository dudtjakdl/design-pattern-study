package patterns.creational.builder.kimys;

import lombok.Builder;

@Builder
public class LombokExample {

    private String title;

    private int nights;

    private int days;

    public static void main(String[] args) {
        // Lombok Builder 사용 예제
        LombokExample trip = LombokExample.builder()
                .title("여행")
                .nights(2)
                .days(3)
                .build();
    }

}
