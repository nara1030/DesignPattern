package ex_06.test_01;

// 실제 프린터
public class RealPrinter315 implements Printer { // 싱글턴 패턴을 사용
	private static Printer printer = null;

	public RealPrinter315() {
	}

	public synchronized static Printer getPrinter() {
		if (printer == null) {
			printer = new RealPrinter315();
		}
		return printer;
	}

	@Override
	public void print(String str) {
		// 실제 프린터 하드웨어를 조작하는 코드
	}
}
