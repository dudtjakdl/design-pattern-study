## 팩토리 메서드 vs 추상 팩토리
| 항목      | 팩토리 메서드 (Factory Method)                                          | 추상 팩토리 (Abstract Factory)                                      |
| ------- | ----------------------------------------------------------------- | -------------------------------------------------------------- |
| 핵심 아이디어 | “객체 **생성 책임**을 서브클래스(또는 오버라이드 가능한 메서드)로 넘긴다.”                     | “**관련 객체군(family)** 을 일관성 있게 함께 생성한다.”                         |
| 결과물     | **한 종류**의 Product를 선택적으로 생성                                       | **여러 종류**의 관련 Product들을 묶음으로 생성                                |
| 구조 포인트  | Creator에 `factoryMethod()`가 있고, 구체 Creator가 어떤 구체 Product를 만들지 결정 | `AbstractFactory`가 여러 `createXxx()`를 제공하고, 구체 팩토리가 제품군을 맞춰서 생성 |
| 사용 시점   | 상위 타입은 고정하되, **구체 클래스 선택**을 바꾸고 싶을 때                              | 테마/플랫폼 등 **서로 호환되는 객체 묶음**을 함께 바꿔야 할 때                         |
| 장점      | 결합도 감소, OCP 준수, 테스트 용이                                            | 제품군 일관성 보장, 교체 용이(테마/플랫폼 단위)                                   |
| 단점      | Creator/ConcreteProduct 수 증가                                      | 추상화/클래스 수가 더 많아 복잡도 증가                                         |

## 추상 팩토리 자바/스프링 예제
### javax.xml.parsers.DocumentBuilderFactory
- XML 파서를 제공하는 팩토리로, DocumentBuilder(파서) 등 관련 객체를 생성
-  구현체를 교체 가능하며, 보안/네임스페이스 옵션 등을 팩토리 레벨에서 일관되게 설정
```java
DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factory.newDocumentBuilder();
Document document = builder.parse(new File("src/main/resources/config.xml"));
System.out.println(document.getDocumentElement());
```
### FactoryBean
- 스프링에서 FactoryBean은 “빈을 만드는 팩토리 자체가 빈으로 등록되는” 특별한 인터페이스
    - FactoryBean#getObject() → 컨테이너가 실제 주입하는 객체
    - FactoryBean#getObjectType() → 컨테이너가 타입 추론할 때 사용
    - 빈 이름으로 주입하면 → getObject() 결과가 주입됨
    - 빈 이름 앞에 & 를 붙이면 → FactoryBean 자신 주입됨