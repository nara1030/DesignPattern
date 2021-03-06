package ex_06;

/*
 * 1. 상속의 규칙 - 5가지
 *   - 피터 코드는 상속의 오용을 막기 위해 상속의 사용을 엄격히 제한하는 규칙을 만들었음
 *   1) 자식 클래스와 부모 클래스 사이는 역할 수행(is role played by) 관계가 아니어야 함
 *   2) 한 클래스의 인스턴스는 다른 서브 클래스의 객체로 변환할 필요가 절대 없어야 함
 *   3) 자식 클래스가 부모 클래스의 책임을 무시하거나 재정의하지 않고 확장만 수행해야 함
 *   4) 자식 클래스가 단지 일부 기능을 재사용할 목적으로 유틸리티 역할을 수행하는 클래스를 상속하지 않아야 함
 *   5) 자식 클래스가 역할, 트랜잭션, 디바이스 등을 특수화해야 함
 */
public abstract class Role {
	public abstract void doIt();
}
