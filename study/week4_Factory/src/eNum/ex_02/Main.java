package eNum.ex_02;

/*
 * Enum ��� �׽�Ʈ
 */
public class Main {
	public static void main(String[] args) {
		ToDo do1 = new ToDo(Day.MONDAY);
		System.out.println(do1.getDay().getName() + "�� �� ���� " + do1.work + "�Դϴ�.");

		System.out.println("====");
		do1.setDay(Day.FRIDAY);
		System.out.println(do1.getDay().getName() + "�� �� ���� " + do1.work + "�Դϴ�.");

		/** Enum�� ���� �Ҵ� �� �ȴٸ�..? */
		System.out.println("====");
		Day.FRIDAY.setName("������");
		do1.setDay(Day.FRIDAY);
		System.out.println(do1.getDay().getName() + "�� �� ���� " + do1.work + "�Դϴ�.");
	}
}
