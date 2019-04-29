package ex_02;

public class UserThread extends Thread {
	public UserThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		Printer printer = Printer.getPrinter();
		printer.print(Thread.currentThread().getName() + " print using " + printer.toString() + ".");
	}
}
