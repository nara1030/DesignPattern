package ex_01;

/*
 * - �ǹ�1. User Ŭ������ Printer Ŭ����
 *   �ܹ��� ���������� �����ߴµ� Ȯ�� �ʿ�(User�� Printer ��� ���� �������� ����)
 *   print �޼��带 ��� �����ߴ��� ���� �ʿ�(�����丵 å���� ����Ǵ� �����ε�)
 *   
 * - �ǹ�2. Printer ��� ������ null ���� ����
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
