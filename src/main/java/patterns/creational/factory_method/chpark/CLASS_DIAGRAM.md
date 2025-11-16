# 팩토리 메소드 패턴 - 클래스 구조도

## 전체 클래스 구조

```
┌─────────────────────────────────────────────────────────────────────────┐
│                        FactoryMethodExample (Client)                     │
│                          + main(args:String[])                           │
└───────────────────────────┬──────────────────────────────────────────────┘
                            │ uses
                            ▼
                    ┌───────────────┐
                    │  CarFactory   │  <<interface>>
                    │  (Creator)    │
                    └───────┬───────┘
                            │ implements
            ┌───────────────┼───────────────┐
            │               │               │
            ▼               ▼               ▼
    ┌─────────────┐ ┌─────────────┐ ┌─────────────┐
    │  Hyundai    │ │   KiaCar    │ │  Genesis    │
    │ CarFactory  │ │  Factory    │ │ CarFactory  │
    │(ConcreteC.) │ │(ConcreteC.) │ │(ConcreteC.) │
    └──────┬──────┘ └──────┬──────┘ └──────┬──────┘
           │               │               │
           │ creates       │ creates       │ creates
           │               │               │
           ▼               ▼               ▼
    ┌─────────────┐ ┌─────────────┐ ┌─────────────┐
    │ HyundaiCar  │ │   KiaCar    │ │ GenesisCar  │
    │(ConcreteP.) │ │(ConcreteP.) │ │(ConcreteP.) │
    └──────┬──────┘ └──────┬──────┘ └──────┬──────┘
           │               │               │
           │ implements    │ implements    │ implements
           └───────────────┴───────────────┘
                           │
                           ▼
                   ┌───────────────┐
                   │      Car      │  <<interface>>
                   │    (Product)  │  ✨ Java 8 default methods
                   ├───────────────┤
                   │ getCarInfo()  │
                   │ displayInfo() │
                   │ drive()       │
                   │ logCreation() │  ◄── default method
                   │validateCar()  │  ◄── default method
                   │  getBrand()   │  ◄── default method
                   └───────┬───────┘
                           │ uses
                           ▼
                   ┌───────────────┐
                   │   CarInfo     │  <<data class>>
                   ├───────────────┤
                   │ - brand       │
                   │ - carName     │
                   │ - production  │
                   │   Year        │
                   │ - carCode     │
                   │ - userName    │
                   │ + toString()  │
                   └───────────────┘
```

## 주요 관계 설명

### 1. Factory Method 패턴 관계
- **CarFactory (Creator)**: Car 객체를 생성하는 팩토리 메소드 정의
- **Concrete Creator**: 각 브랜드별 구체적인 팩토리 구현
- **Car (Product)**: 모든 자동차가 구현해야 하는 인터페이스
- **Concrete Product**: 각 브랜드별 구체적인 자동차 구현

### 2. Java 8 default 메소드 활용
- **Car 인터페이스**에 공통 기능을 default 메소드로 제공:
  - `logCreation()`: 차량 생성 로깅
  - `validateCarInfo()`: 차량 정보 검증
  - `getBrand()`: 브랜드 정보 반환

### 3. 데이터 흐름
```
FactoryMethodExample
    ↓
CarFactory.createCar()
    ↓
(검증 & 로깅) default 메소드 호출
    ↓
Concrete Product 생성
    ↓
CarInfo 객체 사용
```

## 패턴의 이점 (이 예제에서)

1. **확장성**: 새로운 브랜드 추가 시 CarFactory만 구현
2. **공통 로직 재사용**: default 메소드로 중복 코드 제거
3. **유지보수성**: 인터페이스 수정 없이 기능 추가 가능
4. **역추적 호환성**: default 메소드로 기존 코드 영향 없음

