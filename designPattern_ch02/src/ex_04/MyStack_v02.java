package ex_04;

import java.util.ArrayList;

/*
 * - 위임을 사용해 일반화(상속)를 대신하는 과정
 * 1. 자식 클래스에 부모 클래스의 인스턴스를 참조하는 속성을 만든다.
 *    이 속성 필드를 this로 초기화한다.
 * 2. 서브 클래스에 정의된 각 메서드에 1번에서 만든 위임 속성 필드를 참조하도록 변경한다.
 * 3. 서브 클래스에서 일반화 관계 선언을 제거하고 위임 속성 필드에 슈퍼 클래스의 객체를 생성해 대입한다.
 * 4. 서브 클래스에서 사용된 슈퍼 클래스의 메서드에도 위임 메서드를 추가한다.
 * 5. 컴파일하고 잘 동작하는지 확인한다.
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
