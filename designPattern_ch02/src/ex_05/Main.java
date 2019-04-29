package ex_05;

/*
 * - 상속과 정적 메서드의 관계
 *   프로그램 실행 결과를 통해 유추
 *   
 * - 실행 결과
 *   DoIt: A class method
 *   DoThat: A1 class method
 *   DoIt: A1 class method
 *   
 * - 유추
 *   정적 메서드는 상속을 통해 오버라이드되지 않음을 알 수 있음
 *   즉, 정적 메서드를 실행할 때 동적 바인딩을 실행하는 것이 아니고
 *   컴파일할 때 결정된 객체의 타입에 따라 실행될 메서드가 결정된다는 의미
 */
public class Main {
	public static void main(String[] args) {
		A a1 = new A1();
		A1 a2 = new A1();

		a1.doIt();
		a1.doThat();
		a2.doIt();
	}
}
