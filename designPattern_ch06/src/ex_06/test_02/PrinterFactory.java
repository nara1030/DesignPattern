package ex_06.test_02;

public class PrinterFactory {
	private static PrinterFactory printerFactory = null;

	protected Printer() { // 접근 제한자를 protected로 변경
	}

	public synchronized static PrinterFactory getPrinterFactory() {
		if (printerFactory == null) {
			printerFactory = new PrinterFactory();
		}
		return printerFactory;
	}

	public static void setPrinterFactory(PrinterFactory p) { // 정적 setter 메서드
		printerFactory = p;
	}
	
	public Printer getPrinter() {
		return new Printer();
	}
}
