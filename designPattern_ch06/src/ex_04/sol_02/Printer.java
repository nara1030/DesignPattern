package ex_04.sol_02;

/*
 * - ������ ������ - ���� ������ ���ø����̼� ���� �ذ��� 2����
 *   1. ���� ������ �ν��Ͻ��� ����� �ٷ� �ʱ�ȭ�ϴ� ���
 *   2. �ν��Ͻ��� ����� �޼��忡 ����ȭ�ϴ� ���
 *   
 * - �ذ�å 2
 *   �� ����� ���� ������ ȯ�濡�� ���ÿ� ���� �����尡 getPrinter �޼��带
 *   �����ϴ� ��ü�� �����ϴ� ���� ������
 *   ��������� Printer Ŭ������ �ν��Ͻ��� ���� �ϳ��� �ν��Ͻ��� ������
 */
public class Printer {
	private static Printer printer = null;
	private int counter = 0;

	private Printer() {
	}

	public synchronized static Printer getPrinter() {
		if (printer == null) {
			printer = new Printer();
		}
		return printer;
	}

	public void print(String str) {
		counter++;
		System.out.println(str + counter);
	}
}
