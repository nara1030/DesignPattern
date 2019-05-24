package ex_01;

/*
 * - ��Ȳ: �����͸� �ϳ��� �����ؼ� ����ؾ� ��
 * - ����: Printer Ŭ������ ����� ������ �̿�
 *    1) Ŭ���̾�Ʈ ���α׷����� new Printer()�� �ݵ�� �� ���� ȣ��
 *    2) Printer Ŭ������ �����ڸ� private���� ����
 *    3) printer ������ get �޼��尡 static Ÿ������ ����
 *      - ������ �ϳ��� ��ü�� ������ �̸� ��𿡼��� ����(����)�� �� �ֵ��� �ϴ� ��
 *      - ��, ó���� ��ü�� ������� getPrinter �޼��尡 �������� ����Ǿ�� ��
 *      - ���� ���� �޼���� �Ǿ� ���� �ʾҴٸ�(�ͷ���)
 *        -instance.getPrinter();
 *        -���� �������� ���� printer ��ü(instance)�� ���� ȣ���ؾ� ��
 *        -�̰��� ���
 *      - ������ ����������.
 *        - ���� ���� printer�� Ŭ������ �ν��Ͻ��� ������ ������ �����Ǵ� ���� �ƴ϶�
 *          �� �� ���� �����Ǹ� Ŭ������ �ν��Ͻ��� �����Ǳ� ���� �ʱ�ȭ�ȴ�.
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
