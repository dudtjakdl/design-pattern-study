package patterns.creational.prototype.chpark;

import java.util.ArrayList;
import java.util.List;

/**
 * 프로토타입 패턴을 적용한 작업 목록 클래스
 * Cloneable 인터페이스를 구현하여 복제 가능
 */
public class TodoList implements Cloneable {
    private String title;
    private List<Task> tasks;

    public TodoList(String title) {
        this.title = title;
        this.tasks = new ArrayList<>();
    }

    /**
     * Deep Copy를 수행하는 clone 메소드
     */
    @Override
    public TodoList clone() {
        try {
            // 먼저 shallow copy 수행
            TodoList cloned = (TodoList) super.clone();
            
            // Deep copy: Task 리스트를 새로 생성하고 각 Task도 복제
            cloned.tasks = new ArrayList<>();
            for (Task task : this.tasks) {
                cloned.tasks.add(task.clone());
            }
            
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone not supported", e);
        }
    }

    public void addTask(String description, String priority) {
        tasks.add(new Task(description, priority));
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).complete();
        }
    }

    public void resetAllTasks() {
        for (Task task : tasks) {
            task.reset();
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public void printList() {
        System.out.println("\n=== " + title + " ===");
        if (tasks.isEmpty()) {
            System.out.println("작업이 없습니다.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
        System.out.println("==================\n");
    }
}

