package ex_05;

/*
 * - ��Ӱ� ���� �޼����� ����
 *   ���α׷� ���� ����� ���� ����
 *   
 * - ���� ���
 *   DoIt: A class method
 *   DoThat: A1 class method
 *   DoIt: A1 class method
 *   
 * - ����
 *   ���� �޼���� ����� ���� �������̵���� ������ �� �� ����
 *   ��, ���� �޼��带 ������ �� ���� ���ε��� �����ϴ� ���� �ƴϰ�
 *   �������� �� ������ ��ü�� Ÿ�Կ� ���� ����� �޼��尡 �����ȴٴ� �ǹ�
 */
public class Main {
	public static void main(String[] args) {
		A a1 = new A1();
		A1 a2 = new A1();

		a1.doIt();
		a1.doThat();
		a2.doIt();
	}
}
