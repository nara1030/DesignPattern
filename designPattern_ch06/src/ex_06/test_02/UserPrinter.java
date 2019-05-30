package ex_06.test_02;

public class UserPrinter {
	public void doSomething() {
		String str;
		str = "ABC";
		PrinterFactory.getPrinterFactory().getPrinter().print(str);
	}
}
