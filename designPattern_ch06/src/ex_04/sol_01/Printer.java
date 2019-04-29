package ex_04.sol_01;

/*
 * - ������ ������ - ���� ������ ���ø����̼� ���� �ذ��� 2����
 *   1. ���� ������ �ν��Ͻ��� ����� �ٷ� �ʱ�ȭ�ϴ� ���
 *   2. �ν��Ͻ��� ����� �޼��忡 ����ȭ�ϴ� ���
 *   
 * - �ذ�å 1
 *   1. ���� ������ ��ü�� �����Ǳ� �� Ŭ������ �޸𸮿� �ε��� �� ������� �ʱ�ȭ �� ���� ����
 *   2. ���� ������ ���α׷��� ���۵� ������ ����� ������ �������� �ʰ� �޸𸮿� ���
 *      �����ϸ� Ŭ�������� ������ ��� ��ü���� ������ �� ����
 *   �� ����� ���� ������ ȯ�濡�� ������ �����״� if(printer == null)���
 *   ���� �˻� ������ ��õ������ �����ϱ� ���� �����
 */
public class Printer {
	private static Printer printer = new Printer();
	private int counter = 0;

	private Printer() {
	}

	public static Printer getPrinter() {
		return printer;
	}

	public void print(String str) {
		counter++;
		System.out.println(str);
	}
}
