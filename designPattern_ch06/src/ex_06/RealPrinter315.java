package ex_06;

// ���� ������
public class RealPrinter315 implements Printer {
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
		// ���� ������ �ϵ��� �����ϴ� �ڵ�
	}
}
