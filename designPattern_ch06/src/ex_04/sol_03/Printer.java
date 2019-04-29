package ex_04.sol_03;

/*
 * - 프린터 관리자 - 다중 스레드 애플리케이션 문제 해결방법 2가지
 *   1. 정적 변수에 인스턴스를 만들어 바로 초기화하는 방법
 *   2. 인스턴스를 만드는 메서드에 동기화하는 방법
 *   
 * - 해결책 2 문제점
 *   Printer 객체가 하나만 생성되었음에도 여전히 counter 변수의 값이 이상하게 출력됨
 *   이는 여러 개의 스레드가 하나뿐인 counter 변수 값에 동시에 접근해 갱신하기 때문
 *   이 문제를 해결하기 위해 print 메서드의 counter 변수를 변경하는 부분도 동기화
 */
public class Printer {
	private static Printer printer = null;
	private int counter = 0;

	private Printer() {
	}

	public synchronized static Printer getPrinter() {
		if (printer == null) {
			printer = new Printer();
		}
		return printer;
	}

	public void print(String str) {
		synchronized (this) {
			counter++;
			System.out.println(str + counter);
		}
	}
}
