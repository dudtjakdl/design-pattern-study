# 🎨 Design Pattern Study (GoF)
## 📘 스터디 개요
이 레포지토리는 **GoF 디자인 패턴 23가지**를 학습하기 위한 스터디용 저장소입니다.

학습은 백기선 강사의 ['코딩으로 학습하는 GoF의 디자인 패턴'](https://www.inflearn.com/course/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4/dashboard) 강의를 수강하며,

해당 강의의 목차 순서대로 매주 한 가지 패턴의 강의를 수강하고 공부한 내용을 직접 Java 코드 또는 자유로운 형태의 파일로 작성해 서로 공유하는 것을 목표로 합니다.

---

## 👥 스터디 참가자
| 이름  | GitHub ID | 
|-----|------------|
| 김영서 | [@dudtjakdl](https://github.com/dudtjakdl) |
| 김민호 |  |
| 박창현 |  |
| 서성협 |  |
| 안재홍 |  |
| 이채은 |  |

> ⚠️ 참가자는 PR 제출 시 본인 닉네임을 반드시 브랜치명에 포함해주세요.

---

## 🗂️ 레포지토리 구조
디자인 패턴은 **GoF의 세 가지 분류 (Creational / Structural / Behavioral)** 에 따라 구성되어 있습니다.

세 가지 분류와 각 분류 안에 포함된 디자인 패턴 명칭을 패키지명으로 나누었으며,

공부한 파일의 위치는 각 디자인 패턴 패키지 구조 내에 포함시킵니다. (ex: 싱글톤 패턴의 학습 내용은 patterns-creational-singleton 내에 위치)


---

## 🚀 진행 방식

1. 매주 한 가지 패턴을 학습합니다.
2. 학습한 내용을 Java 파일 또는 자유로운 형식의 파일로 정리합니다. (주석 또는 README.md 파일을 메모로 활용 가능)
3. 코드를 **개인 fork 저장소에 푸시**하고, 원본 레포로 **Pull Request(PR)** 를 생성합니다.
4. PR 링크를 팀즈방에 공유하고, 서로의 PR을 리뷰하며 피드백을 남깁니다. (리뷰 및 피드백은 필수는 아님)

---

## 🧾 제출 방식 (PR 가이드)

1️⃣ **원본 레포 Fork 받기**
- 원본 저장소: [`dudtjakdl/design-pattern-study`](https://github.com/dudtjakdl/design-pattern-study)
- 자신의 계정으로 Fork 생성

2️⃣ **브랜치 생성**
- 브랜치명 규칙:  
  - <닉네임>-<디자인패턴이름>
  - 예시: kimys-singleton

3️⃣ **작업 및 커밋**
- 해당 패턴 폴더(예: `patterns/creational/singleton/`)에 본인의 학습 코드 추가 후 커밋

4️⃣ **브랜치 푸시**
- Fork 받은 원격 저장소로 푸시

5️⃣ Pull Request 생성

- Base repository: dudtjakdl/design-pattern-study

- Base branch: main

- Head repository: <본인아이디>/design-pattern-study

- Compare branch: 자신이 작업한 브랜치

- PR 제목 예시: [Singleton] 싱글톤 패턴 학습 내용 제출

- 내용: 학습 요약 / 주요 포인트 / 참고자료 등 자유롭게 작성

6️⃣ PR 링크 공유

- Teams 에 PR 링크 공유

---