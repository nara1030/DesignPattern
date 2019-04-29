package ex_02;

/*
 * - 시나리오대로 동작함을 확인하기 위해 스레드 스케줄링 변경
 *   인스턴스 생성 문장 바로 앞에 Thread.sleep(1) 추가
 *   스레드 실행을 고의적으로 1ms 동안 정지하도록 함
 *   
 * - 1ms는 컴퓨터에게 참으로 긴 시간임
 */
public class Printer {
	private static Printer printer = null;

	private Printer() {
	}

	public static Printer getPrinter() {
		if (printer == null) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
			printer = new Printer();

		}
		return printer;
	}

	public void print(String str) {
		System.out.println(str);
	}
}
