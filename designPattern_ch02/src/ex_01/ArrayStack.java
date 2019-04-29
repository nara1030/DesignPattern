package ex_01;

/*
 * 1. 개념
 * - 소프트웨어에서 요구사항의 변경은 당연한 것
 * - 유연한 대처를 위해서는 높은 응집도와 낮은 결합도 유지 필요
 * - 응집도: 클래스나 모듈 안의 요소들이 얼마나 밀접하게 관련되어 있는지
 * - 결합도: 어떤 기능을 실행하는 데 다른 클래스나 모듈들에 얼마나 의존적인지
 * 
 * - 캡슐화: 낮은 결합도를 유지할 수 있도록 해주는 객체지향 설계 원리
 * - 캡슐화는 정보 은닉(information hiding)을 통해 높은 응집도와 낮은 결합도를 갖도록 한다.
 * - 정보 은닉: 필요 없는 정보는 외부에서 접근하지 못하도록 제한하는 것
 * 
 * 2. 예제
 * - 자료구조에 모두 public 키워드를 붙여 외부에 공개
 * - 즉, StackClient 클래스처럼 push 혹은 pop 메서드를 사용하지 않고 직접 배열에 값 저장 가능
 * - 이런 경우 ArrayStack과 StackClient 클래스는 강한 결합이 발생
 * 
 * - 가령 ArrayList 클래스를 사용해 스택 구현이 변경되면 StackClient 클래스도 변경 필요
 * - 이는 StackClient 클래스가 은닉된 정보를 직접 사용했기 때문
 * 
 * 3. 의문
 * - push에서와 마찬가지(앞에 ++)로 pop에서도 뒤에 -- 가 아니라 앞에 -- 붙여야 하지 않나? 
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

	public boolean isEmpty() { // 스택이 비어 있는지 검사
		return (top == -1);
	}

	public boolean isFull() { // 스택이 꽉 차 있는지 검사
		return (top == this.stackSize - 1);
	}

	public void push(int item) { // 스택에 아이템 추가
		if (isFull()) {
			System.out.println("Inserting fail! Array Stack is full!!");
		} else {
			itemArray[++top] = item;
			System.out.println("Inserted Item : " + item);
		}
	}

	public int pop() { // 스택의 톱에 있는 아이템 반환
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
