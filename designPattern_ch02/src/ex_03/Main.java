package ex_03;

/*
 * 1. ������
 *   - �ش� ��ü�� ȣ�������� �ʾƵ� talk �޼ҵ� �ٸ��� ȣ��
 *   
 *   - ����
 *     �Ϲ�ȭ ���迡 ���� �� �θ� Ŭ������ ���� ������ �ڽ� Ŭ������ ��ü ���� ����
 *     ��, �θ� Ŭ������ ���� ������ ������ �� �ִ� ���� �θ� Ŭ������ ������ ������ �޼������
 * 2. static �޼��� ����
 *   -
 */
public class Main {
	public static void main(String[] args) {
		Pet[] p = { new Cat(), new Dog(), new Parrot() };
		groupTalk(p);
	}

	public static void groupTalk(Pet[] p) {
		int i;

		for (i = 0; i < 3; i++) {
			p[i].talk();
		}
	}
}
