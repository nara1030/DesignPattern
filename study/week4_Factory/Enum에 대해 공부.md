Enum
====

### 정리
1. 개념
2. 필요성
	* 기존 방식의 문제
	* Enum의 장점
3. 사용방법
	* 두 가지 방법
		1. Enum만 선언해서 클래스처럼 사용
		2. 클래스 내부에 Enum을 내부 클래스처럼 사용
	* 기타
		1. 추가 속성 부여 가능
		2. 생성자는 private
		3. 관련 static 메서드
4. 내부 동작방식
	* Enum은 컴파일 타임에 모든 값을 알아야 함
		* 즉, 런타임 때 동적으로 값 정해줄 수 없음(**setter 메소드 있지 않아?**)
		* 따라서 new 할 수 없고, public 접근이 금지되어 있음(오직 private)

### 참고
1. [Enum에 대해-1](https://sjh836.tistory.com/134)
2. [Enum에 대해-2](https://hamait.tistory.com/383)