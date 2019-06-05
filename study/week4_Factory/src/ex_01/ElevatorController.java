package ex_01;

public class ElevatorController {
	private int id; // ���������� ID
	private int curFloor; // ���� ��

	public ElevatorController(int id) {
		this.id = id;
		curFloor = 1;
	}

	public void gotoFloor(int destination) {
		System.out.println("Elevator [" + id + "] Floor: " + curFloor);

		// ���� �� ����, �� �־��� ������ ��(destination)���� ���������Ͱ� �̵���
		curFloor = destination;
		System.out.println(" ==> " + curFloor);
	}
}
