package eNum.ex_01;

/*
 * Enum ��� �׽�Ʈ
 */
public class Main {
	public static void main(String[] args) {
		ToDo do1 = new ToDo(Day.MONDAY);
		System.out.println(do1.getDay() + "�� �� ���� " + do1.work + "�Դϴ�.");

		System.out.println("====");
		do1.setDay(Day.FRIDAY);
		System.out.println(do1.getDay() + "�� �� ���� " + do1.work + "�Դϴ�.");

	}
}
