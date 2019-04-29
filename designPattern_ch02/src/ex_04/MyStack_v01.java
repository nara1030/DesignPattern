package ex_04;

import java.util.ArrayList;

/*
 * - 일반화 관계와 위임
 *   일반화 관계는 속성이나 기능의 상속, 즉 재사용만을 위해 존재하지 않음
 *   관계 없는 수많은 연산이나 속성도 같이 상속받게 된다면 빚이 될 가능성 존재
 * - 일반화 관계: is a kind of 관계
 *   만약 어떤 클래스의 일부 기능만 재사용하고 싶은 경우에는 어떻게 하면 좋을까?
 * - 위임(delegation): 자신이 직접 기능을 실행하지 않고 다른 클래스의 객체가 기능 실행하도록 하는 것
 * 
 * - 의문
 *   선언시 클래스 옆에 <>는 뭔가? 익숙치가 않네.
 */
public class MyStack_v01<String> extends ArrayList<String> {
	private void push(String element) {
		add(element);

	}

	private String pop() {
		return remove(size() - 1);
	}
}
