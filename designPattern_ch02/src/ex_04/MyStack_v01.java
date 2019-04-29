package ex_04;

import java.util.ArrayList;

/*
 * - �Ϲ�ȭ ����� ����
 *   �Ϲ�ȭ ����� �Ӽ��̳� ����� ���, �� ���븸�� ���� �������� ����
 *   ���� ���� ������ �����̳� �Ӽ��� ���� ��ӹް� �ȴٸ� ���� �� ���ɼ� ����
 * - �Ϲ�ȭ ����: is a kind of ����
 *   ���� � Ŭ������ �Ϻ� ��ɸ� �����ϰ� ���� ��쿡�� ��� �ϸ� ������?
 * - ����(delegation): �ڽ��� ���� ����� �������� �ʰ� �ٸ� Ŭ������ ��ü�� ��� �����ϵ��� �ϴ� ��
 * 
 * - �ǹ�
 *   ����� Ŭ���� ���� <>�� ����? �ͼ�ġ�� �ʳ�.
 */
public class MyStack_v01<String> extends ArrayList<String> {
	private void push(String element) {
		add(element);

	}

	private String pop() {
		return remove(size() - 1);
	}
}
