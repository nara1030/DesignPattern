package ex_06.test_02;

public class PrinterFactory {
	private static PrinterFactory printerFactory = null;

	protected Printer() { // ���� �����ڸ� protected�� ����
	}

	public synchronized static PrinterFactory getPrinterFactory() {
		if (printerFactory == null) {
			printerFactory = new PrinterFactory();
		}
		return printerFactory;
	}

	public static void setPrinterFactory(PrinterFactory p) { // ���� setter �޼���
		printerFactory = p;
	}
	
	public Printer getPrinter() {
		return new Printer();
	}
}
