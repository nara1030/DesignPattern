package ex_02;

// ������: �� ��ȭ�� �繫�� ��ȭ�� �迭�� �ε����� ���� �����ؾ� �ϹǷ� ����
// �ذ�å: ��ȭ���� ���� �����ؼ� ����ϸ� �ذ� ����
public class Person {
	private Phone[] phones;

	public Person() {
		phones = new Phone[2];
	}

	public Phone getPhone(int i) {
		if (i == 0 || i == 1) {
			return phones[i]; // i = 0�̸� �� ��ȭ, i = 1�̸� �繫�� ��ȭ
		}
		return null;
	}
}
