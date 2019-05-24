package ex_01;

/*
 * - 상황: 프린터를 하나만 공유해서 사용해야 함
 * - 제약: Printer 클래스를 사용해 프린터 이용
 *    1) 클라이언트 프로그램에서 new Printer()가 반드시 한 번만 호출
 *    2) Printer 클래스의 생성자를 private으로 선언
 *    3) printer 변수와 get 메서드가 static 타입으로 선언
 *      - 목적은 하나의 객체만 생성해 이를 어디에서든 참조(공유)할 수 있도록 하는 것
 *      - 즉, 처음에 객체를 만들려면 getPrinter 메서드가 정적으로 선언되어야 함
 *      - 만약 정적 메서드로 되어 있지 않았다면(귀류법)
 *        -instance.getPrinter();
 *        -아직 생성되지 않은 printer 객체(instance)를 통해 호출해야 함
 *        -이것은 모순
 *      - 변수도 마찬가지다.
 *        - 정적 변수 printer는 클래스의 인스턴스가 생성될 때마다 생성되는 것이 아니라
 *          딱 한 번만 생성되며 클래스의 인스턴스가 생성되기 전에 초기화된다.
 */
public class Printer {
	private static Printer printer = null;

	private Printer() {
	}

	public static Printer getPrinter() {
		if (printer == null) {
			printer = new Printer();
		}
		return printer;
	}

	public void print(String str) {
		System.out.println(str);
	}
}
