package ex_06.test_01;

// �׽�Ʈ�� ��¥ ������
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
