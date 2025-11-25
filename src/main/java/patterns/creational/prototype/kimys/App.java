package patterns.creational.prototype.kimys;

public class App {

    public static void main(String[] args) {
        // 프로토타입 패턴 : 기존 인스턴스를 복제하여 새로운 인스턴스를 만드는 방법
        // DB 조회나 client 요청을 통해서 데이터를 가져온 인스턴스를 복제할 때 주로 사용

        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = githubIssue.clone();
        System.out.println(clone.getUrl());

        repository.setUser("kimys");

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue)); // shallow copy, deep copy 냐에 따라서 결과 달라짐
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.getRepository() == githubIssue.getRepository()); // shallow copy, deep copy 냐에 따라서 결과 달라짐

        System.out.println(clone.getUrl());

    }

}
