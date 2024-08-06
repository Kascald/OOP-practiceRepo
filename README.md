## OOP-Practice . . .
***

### 객체지향
- 추상화
- 다형성
- 캡슐화
- 상속

### 객체지향 SOLID 5가지 원직
- SRP : 단일 책임의 원칙
- OCP : 개방 패쇄의 원칙
- LSP : 리스코프 치환의 원칙
- ISP : 인터페이스 분리의 원칙
- DIP : 의존성 역전의 원칙

## 높은 응집도와 낮은 결합도를 가짐으로 코드의 유지보수, 변경에<br>유연하게 대응할 수 있음.

### 테스트 코드를 작성하는 이유
- 문서화 역할
- 코드 결함 발견
- 리팩토링의 안정성 확보
- 테스트코드를 먼저 작성함으로써 테스트 하기 쉬운 코드작성법에 접근용이


### 요구사항에 따라 도메인을 구성하는 객체가 어떤 것이 필요할 지 생각하기 ###
- 객체들 간의 관계 정립하기
- 동적인 객체를 정적인 타입으로 추상화하여 모델링하기
- 협력관계를 정립하기
- 객체들을 포괄하는 타입에 적절한 책임을 부여하기
- 구현

#### 패키지 설명 ( TDD 방식 작성을 연습하기 )
- passwordGenerator : 패스워드 생성기 유효성검증 
- calculatorPractice : 간단한 사칙연산 계산기를 TDD 방식 객체지향으로 작성
- gradeCalculator : 학점 계산기를 TDD 방식 객체지향으로 작성
- restaurant : 음식점에서 손님이 요리를 주문하는 상황을 가정하고 TDD 방식으로 각 객체를 작성