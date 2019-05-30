package ex_06;

// 테스트용 가짜 프린
public class FakePrinter implements Printer {
	private String str;

	@Override
	public void print(String str) {
		this.str = str;
	}

	public String get() {
		return str;
	}
}
