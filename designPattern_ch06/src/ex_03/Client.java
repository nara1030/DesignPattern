package ex_03;

/*
 * - ������
 *   ���� �����忡�� Printer Ŭ������ �̿��� �� �ν��Ͻ��� 1�� �̻� �����Ǵ� ��� �߻� ����
 *   (���� ������ ���ø����̼��� �ƴ� ��쿣 ������ ���� ����)
 * 
 * - ������Ȳ
 *   Printer Ŭ������ ���¸� �����ؾ� �ϴ� ���
 *   ���� ��� counter ������ ���� ���� �ν��Ͻ��� �����ؾ� �� ��� ������ ����
 *   (�� ��� Printer Ŭ������ �ν��Ͻ����� counter ������ ���� ����� �����ϱ� ����)
 */
public class Client {
	private static final int THREAD_NUM = 5;

	public static void main(String[] args) {
		UserThread[] users = new UserThread[THREAD_NUM];
		for (int i = 0; i < THREAD_NUM; i++) {
			users[i] = new UserThread((i + 1) + "-thread");
			users[i].start();
		}
	}
}
