package eNum.ex_01;

/*
 * Enum 사용 테스트
 */
public class Main {
	public static void main(String[] args) {
		ToDo do1 = new ToDo(Day.MONDAY);
		System.out.println(do1.getDay() + "에 할 일은 " + do1.work + "입니다.");

		System.out.println("====");
		do1.setDay(Day.FRIDAY);
		System.out.println(do1.getDay() + "에 할 일은 " + do1.work + "입니다.");

	}
}
