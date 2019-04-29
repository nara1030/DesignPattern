package ex_04.sol_03;

/*
 * - ������ ������ - ���� ������ ���ø����̼� ���� �ذ��� 2����
 *   1. ���� ������ �ν��Ͻ��� ����� �ٷ� �ʱ�ȭ�ϴ� ���
 *   2. �ν��Ͻ��� ����� �޼��忡 ����ȭ�ϴ� ���
 *   
 * - �ذ�å 2 ������
 *   Printer ��ü�� �ϳ��� �����Ǿ������� ������ counter ������ ���� �̻��ϰ� ��µ�
 *   �̴� ���� ���� �����尡 �ϳ����� counter ���� ���� ���ÿ� ������ �����ϱ� ����
 *   �� ������ �ذ��ϱ� ���� print �޼����� counter ������ �����ϴ� �κе� ����ȭ
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
		synchronized (this) {
			counter++;
			System.out.println(str + counter);
		}
	}
}
