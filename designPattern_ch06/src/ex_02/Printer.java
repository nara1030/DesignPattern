package ex_02;

/*
 * - �ó�������� �������� Ȯ���ϱ� ���� ������ �����ٸ� ����
 *   �ν��Ͻ� ���� ���� �ٷ� �տ� Thread.sleep(1) �߰�
 *   ������ ������ ���������� 1ms ���� �����ϵ��� ��
 *   
 * - 1ms�� ��ǻ�Ϳ��� ������ �� �ð���
 */
public class Printer {
	private static Printer printer = null;

	private Printer() {
	}

	public static Printer getPrinter() {
		if (printer == null) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
			printer = new Printer();

		}
		return printer;
	}

	public void print(String str) {
		System.out.println(str);
	}
}
