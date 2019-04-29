package ex_04;

import java.util.ArrayList;

/*
 * - ������ ����� �Ϲ�ȭ(���)�� ����ϴ� ����
 * 1. �ڽ� Ŭ������ �θ� Ŭ������ �ν��Ͻ��� �����ϴ� �Ӽ��� �����.
 *    �� �Ӽ� �ʵ带 this�� �ʱ�ȭ�Ѵ�.
 * 2. ���� Ŭ������ ���ǵ� �� �޼��忡 1������ ���� ���� �Ӽ� �ʵ带 �����ϵ��� �����Ѵ�.
 * 3. ���� Ŭ�������� �Ϲ�ȭ ���� ������ �����ϰ� ���� �Ӽ� �ʵ忡 ���� Ŭ������ ��ü�� ������ �����Ѵ�.
 * 4. ���� Ŭ�������� ���� ���� Ŭ������ �޼��忡�� ���� �޼��带 �߰��Ѵ�.
 * 5. �������ϰ� �� �����ϴ��� Ȯ���Ѵ�.
 */
public class MyStack_v02<String> extends ArrayList<String> {
	private ArrayList<String> arList = this;
	
	private void push(String element) {
		arList.add(element);

	}

	private String pop() {
		return arList.remove(arList.size() - 1);
	}
}
