package patterns.creational.prototype.kimys;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student keesun = new Student("keesun");
        Student whiteship = new Student("whiteship");
        // ArrayList 클래스는 Clonable 상속하지만, 상위 인터페이스 타입인 List는 Clonable 상속 X
        List<Student> students = new ArrayList<>();
        students.add(keesun);
        students.add(whiteship);

        // 실무에서 자주 쓰이는 리스트 shallow copy
        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
