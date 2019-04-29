package ex_01;

/*
 * 1. ����
 * - ����Ʈ����� �䱸������ ������ �翬�� ��
 * - ������ ��ó�� ���ؼ��� ���� �������� ���� ���յ� ���� �ʿ�
 * - ������: Ŭ������ ��� ���� ��ҵ��� �󸶳� �����ϰ� ���õǾ� �ִ���
 * - ���յ�: � ����� �����ϴ� �� �ٸ� Ŭ������ ���鿡 �󸶳� ����������
 * 
 * - ĸ��ȭ: ���� ���յ��� ������ �� �ֵ��� ���ִ� ��ü���� ���� ����
 * - ĸ��ȭ�� ���� ����(information hiding)�� ���� ���� �������� ���� ���յ��� ������ �Ѵ�.
 * - ���� ����: �ʿ� ���� ������ �ܺο��� �������� ���ϵ��� �����ϴ� ��
 * 
 * 2. ����
 * - �ڷᱸ���� ��� public Ű���带 �ٿ� �ܺο� ����
 * - ��, StackClient Ŭ����ó�� push Ȥ�� pop �޼��带 ������� �ʰ� ���� �迭�� �� ���� ����
 * - �̷� ��� ArrayStack�� StackClient Ŭ������ ���� ������ �߻�
 * 
 * - ���� ArrayList Ŭ������ ����� ���� ������ ����Ǹ� StackClient Ŭ������ ���� �ʿ�
 * - �̴� StackClient Ŭ������ ���е� ������ ���� ����߱� ����
 * 
 * 3. �ǹ�
 * - push������ ��������(�տ� ++)�� pop������ �ڿ� -- �� �ƴ϶� �տ� -- �ٿ��� ���� �ʳ�? 
 */
public class ArrayStack {
	public int top;
	public int[] itemArray;
	public int stackSize;

	public ArrayStack(int stackSize) {
		itemArray = new int[stackSize];
		top = -1;
		this.stackSize = stackSize;
	}

	public boolean isEmpty() { // ������ ��� �ִ��� �˻�
		return (top == -1);
	}

	public boolean isFull() { // ������ �� �� �ִ��� �˻�
		return (top == this.stackSize - 1);
	}

	public void push(int item) { // ���ÿ� ������ �߰�
		if (isFull()) {
			System.out.println("Inserting fail! Array Stack is full!!");
		} else {
			itemArray[++top] = item;
			System.out.println("Inserted Item : " + item);
		}
	}

	public int pop() { // ������ �鿡 �ִ� ������ ��ȯ
		if (isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!");
			return -1;
		} else {
			return itemArray[top--];
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Peeking fail! Array Stack is empty");
			return -1;
		} else {
			return itemArray[top];
		}
	}
}
