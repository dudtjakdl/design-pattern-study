package patterns.creational.prototype.chpark;

/**
 * 프로토타입 패턴 예제
 * 
 * 일일 작업 체크리스트를 프로토타입으로 활용하여
 * 매일 반복되는 작업 목록을 쉽게 생성하는 예제
 */
public class PrototypeExample {
    public static void main(String[] args) {
        System.out.println("===== 프로토타입 패턴: 일일 작업 체크리스트 =====\n");

        // 1. 기본 템플릿(프로토타입) 생성
        TodoList dailyRoutine = new TodoList("일일 업무 루틴");
        dailyRoutine.addTask("이메일 확인", "HIGH");
        dailyRoutine.addTask("일일 스탠드업 미팅", "HIGH");
        dailyRoutine.addTask("코드 리뷰", "MEDIUM");
        dailyRoutine.addTask("문서 업데이트", "LOW");
        dailyRoutine.addTask("내일 할 일 계획", "MEDIUM");

        System.out.println("📋 프로토타입 생성 (기본 템플릿):");
        dailyRoutine.printList();

        // 2. 월요일 작업 목록 (프로토타입 복제)
        TodoList mondayTasks = dailyRoutine.clone();
        mondayTasks.setTitle("월요일 작업 목록");
        mondayTasks.addTask("주간 회의 참석", "HIGH");
        
        System.out.println("🔵 월요일 작업 목록 (복제 후 추가):");
        mondayTasks.printList();

        // 3. 화요일 작업 목록 (프로토타입 복제)
        TodoList tuesdayTasks = dailyRoutine.clone();
        tuesdayTasks.setTitle("화요일 작업 목록");
        tuesdayTasks.addTask("프로젝트 진행 상황 보고", "MEDIUM");
        
        System.out.println("🟢 화요일 작업 목록 (복제 후 추가):");
        tuesdayTasks.printList();

        // 4. 작업 완료 처리 (Deep Copy 확인)
        System.out.println("✅ 월요일 작업 일부 완료:");
        mondayTasks.completeTask(0); // 이메일 확인
        mondayTasks.completeTask(1); // 스탠드업 미팅
        mondayTasks.printList();

        // 5. Deep Copy 검증: 원본과 복제본이 독립적임을 확인
        System.out.println("📋 원본 프로토타입 (변경 없음):");
        dailyRoutine.printList();

        System.out.println("🟢 화요일 작업 목록 (월요일 작업과 독립적):");
        tuesdayTasks.printList();

        // 6. 장점 설명
        System.out.println("===== 프로토타입 패턴의 장점 =====");
        System.out.println("# 매일 반복되는 작업 목록을 빠르게 생성");
        System.out.println("# 복잡한 객체 생성 과정을 숨김 (각 Task를 일일이 추가할 필요 없음)");
        System.out.println("# Deep Copy로 인해 각 작업 목록이 독립적으로 관리됨");
        System.out.println("# 필요에 따라 복제 후 추가 작업을 더할 수 있음");
    }
}

