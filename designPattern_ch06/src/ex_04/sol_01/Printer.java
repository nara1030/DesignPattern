package ex_04.sol_01;

/*
 * - 프린터 관리자 - 다중 스레드 애플리케이션 문제 해결방법 2가지
 *   1. 정적 변수에 인스턴스를 만들어 바로 초기화하는 방법
 *   2. 인스턴스를 만드는 메서드에 동기화하는 방법
 *   
 * - 해결책 1
 *   1. 정적 변수는 객체가 생성되기 전 클래스가 메모리에 로딩될 때 만들어져 초기화 한 번만 실행
 *   2. 정적 변수는 프로그램이 시작될 때부터 종료될 때까지 없어지지 않고 메모리에 계속
 *      상주하며 클래스에서 생성된 모든 객체에서 참조할 수 있음
 *   이 방법은 다중 스레드 환경에서 문제를 일으켰던 if(printer == null)라는
 *   조건 검사 구문을 원천적으로 제거하기 위한 방법임
 */
public class Printer {
	private static Printer printer = new Printer();
	private int counter = 0;

	private Printer() {
	}

	public static Printer getPrinter() {
		return printer;
	}

	public void print(String str) {
		counter++;
		System.out.println(str);
	}
}
