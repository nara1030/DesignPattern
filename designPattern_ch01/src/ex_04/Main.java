package ex_04;

/*
 * 1. ������ �� set �޼���
 *  - ��ü ���� ���� set �޼��� ����� �� ����.
 *  - ��, �����ڴ� �ʼ����� set �޼���� �ʼ��� �ƴϴ�.
 *  - ���� �����ڸ� ȣ������ ����� '���'�̶�� ������ ���� ǥ�� �� ��
 *  - set �޼��带 ���� Advisor�� ���� �ʿ�
 * 2. ��������(Ŭ���� A, B ����)
 *  - �� ���� �������־�� �Ѵ�.
 *  - ����1. ����� �ν� or �ܹ��� �ν�
 *    - �ش� Ŭ���� �� ��������� ���� ����
 *  - ����2. ���߼�
 *    - ����� �÷��� ���
 * 3. ��ü ������ �� name(��� ����)
 *  - �Ʒ� ������ hongGilDong, manSup ���� ���� ���� �� ����
 */

public class Main {
	public static void main(String[] args) {
		Professor hongGilDong = new Professor();
		Student manSup = new Student();
		hongGilDong.setStudent(manSup);
		hongGilDong.advise();

		// �߰�
		// ������ ��� �л��� �����ߴµ�, ��� �л��� ���� ������ ����� �����Ǿ����� Ȯ��
		// ������ ��� �л� �����ϰ� �Ǿ� �ִ� ���� 1���� ����� ��(�� ���� 1��1������)
		System.out.println(hongGilDong.toString());
		System.out.println(manSup.getAdvisor().toString());
	}
}
