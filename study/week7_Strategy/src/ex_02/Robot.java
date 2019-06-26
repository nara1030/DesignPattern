package ex_02;

/*
 * - 리팩토링(ex_01 → ex_02)
 *   1. Robot 클래스 입장에서 보면 구체적인 이동 방식과 공격 방식이 MovingStrategy와 AttackStrategy 인터페이스에 의해 캡슐화되어 있음
 *     - 새로운 공격 방식 혹은 기존의 변화도 인터페이스들이 일종의 방화벽 역할을 수행해 Robot 클래스의 변경 방지(OCP 만족 설계)
 *   2. 외부에서 로봇의 이동 방식과 공격 방식을 임의대로 바꾸도록 해주는 메서드 필요
 *     - 상속 대신 집약 관계 이용했기 때문에 이런 변경이 가능(??)
 */
public abstract class Robot {
	private String name;
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;

	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void move() {
		movingStrategy.move();
	}

	public void attack() {
		attackStrategy.attack();
	}

	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

}
