package ex_06.test_02;

public class FakePrinterFactory extends PrinterFactory {
	@Override
	public Printer getPrinter() {
		return new FakePrinter();
	}
}
