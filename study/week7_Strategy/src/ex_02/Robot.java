package ex_02;

/*
 * - �����丵(ex_01 �� ex_02)
 *   1. Robot Ŭ���� ���忡�� ���� ��ü���� �̵� ��İ� ���� ����� MovingStrategy�� AttackStrategy �������̽��� ���� ĸ��ȭ�Ǿ� ����
 *     - ���ο� ���� ��� Ȥ�� ������ ��ȭ�� �������̽����� ������ ��ȭ�� ������ ������ Robot Ŭ������ ���� ����(OCP ���� ����)
 *   2. �ܺο��� �κ��� �̵� ��İ� ���� ����� ���Ǵ�� �ٲٵ��� ���ִ� �޼��� �ʿ�
 *     - ��� ��� ���� ���� �̿��߱� ������ �̷� ������ ����(??)
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
