package ex_04.sol_02;

/*
 * - 프린터 관리자 - 다중 스레드 애플리케이션 문제 해결방법 2가지
 *   1. 정적 변수에 인스턴스를 만들어 바로 초기화하는 방법
 *   2. 인스턴스를 만드는 메서드에 동기화하는 방법
 *   
 * - 해결책 2
 *   이 방법은 다중 스레드 환경에서 동시에 여러 스레드가 getPrinter 메서드를
 *   소유하는 객체에 접근하는 것을 방지함
 *   결과적으로 Printer 클래스의 인스턴스가 오직 하나의 인스턴스만 생성함
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
		counter++;
		System.out.println(str + counter);
	}
}
