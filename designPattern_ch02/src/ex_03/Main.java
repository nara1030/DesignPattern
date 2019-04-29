package ex_03;

/*
 * 1. 다형성
 *   - 해당 객체가 호출해주지 않아도 talk 메소드 다르게 호출
 *   
 *   - 주의
 *     일반화 관계에 있을 때 부모 클래스의 참조 변수가 자식 클래스의 객체 참조 가능
 *     단, 부모 클래스의 참조 변수가 접근할 수 있는 것은 부모 클래스가 물려준 변수와 메서드뿐임
 * 2. static 메서드 기준
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
