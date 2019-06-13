싱글턴 패턴
========
+ 학습 목표
	+ 싱글턴 패턴 이해하기
	+ 다중 스레드와 싱글턴 패턴의 관계 이해하기
- - - - -

### 목차
1. [적용 상황](#적용-상황)
2. [정의](#정의)
3. [단계별 예시](#단계별-예시)

### 적용 상황
1. 상황
	* 사용할 수 있는 자원(ex. 프린터 관리자)이 제한되어 있음
2. 구현 방법
	1. 컨텍스트 컨테이너가 객체 하나만을 관리하는 경우(예: Servlet, Spring의 Bean)
	2. 클래스 자체에서 구현(아래 예시와 같은 방법)

### 정의
1. 싱글톤 패턴(Singleton Pattern)
	* 인스턴스가 오직 하나만 생성되는 것을 보장하고 어디에서든 이 인스턴스에 접근할 수 있도록 하는 디자인 패턴
2. 싱글톤(Singleton: metaclass)
	* 책임: 하나의 인스턴스만을 생성하는 책임
	* 수행: getInstance 메서드를 통해 모든 클라이언트에게 동일한 인스턴스를 반환하는 작업을 수행

### 가장 간단한 예시
```java
public class Printer {
	private static Printer printer = null;
	private Printer() {}
	
	public static Printer getPrinter() {
		if (printer == null) {
			printer = new Printer(); // Printer 인스턴스 생성
		}
		return printer;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
}
```

* 코드 해설
	1. private
		* 생성자를 외부(클라이언트)에서 호출할 수 없게 하기 위함
			* 클래스 내부에서는 new 연산자로 생성자 호출이 가능
		* 정적 필드에도 private 접근 제한자를 붙여 외부에서 필드값을 변경하지 못하도록 막음
	2. static
		* getPrinter 메서드가 정적으로 선언되어진 이유
			* 메서드 기능 구현: 단 하나의 객체만 생성하는 것이므로 처음 객체를 만들기 위해서 static 선언(귀류법)
		* 정적 변수 printer
			* 클래스의 인스턴스가 생성될 때마다 생성되는 것이 아니라 딱 한 번만 생성되며  
			  클래스의 인스턴스가 생성되기 전에 초기화되므로 static 선언
		* 추가
			1. 개념
				* 정적 멤버는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 소속된 멤버이기 때문에 클래스 멤버라고도 함
			2. 관리
				* 정적 필드와 정적 메소드는 클래스에 고정된 멤버이므로 클래스 로더가 클래스(바이트 코드)를 로딩해서  
				  메소드 메모리 영역에 적재할 때 클래스별로 관리됨
			3. 기준
				* 필드: 객체마다 가지고 있어야 하는 데이터인가, 공용적인 데이터인가
				* 메소드: 인스턴스 필드를 이용해 실행해야 하는가, 외부에서 주어진 매개값 등을 사용하는가
 
### 참고
[멀티 스레드 환경에서의 올바른 싱글톤](https://medium.com/@joongwon/multi-thread-%ED%99%98%EA%B2%BD%EC%97%90%EC%84%9C%EC%9D%98-%EC%98%AC%EB%B0%94%EB%A5%B8-singleton-578d9511fd42)