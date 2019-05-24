package ex_06;

public class UsePrinter {
	/*
	 *  - doSomething 메서드
	 *    인터페이스의 단위 테스트를 하는 상황을 가정해 인자를 넘김
	 */
	
	public void doSomething(Printer printer) {
		String str;
		
		str = "ABC";
		
		printer.print(str);
	}
}
