package ex_01;

/*
 * - 의문1. User 클래스와 Printer 클래스
 *   단방향 연관관계라고 생각했는데 확인 필요(User에 Printer 멤버 변수 존재하지 않음)
 *   print 메서드를 어떻게 참조했는지 관찰 필요(리팩토링 책에도 참고되는 유형인듯)
 *   
 * - 의문2. Printer 멤버 변수에 null 대입 이유
 */
public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public void print() {
		Printer printer = Printer.getPrinter();
		printer.print(this.name + " print using " + printer.toString() + ".");
	}
}
