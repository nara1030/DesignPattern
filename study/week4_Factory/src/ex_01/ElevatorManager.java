package ex_01;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private ThroughputScheduler scheduler;

	// �־��� ����ŭ�� ElevatorController�� ������
	public ElevatorManager(int countrollerCount) {
		controllers = new ArrayList<ElevatorController>(countrollerCount);
		for (int i = 0; i < countrollerCount; i++) {
			ElevatorController controller = new ElevatorController(i);
			controllers.add(controller);
		}
		scheduler = new ThroughputScheduler(); // ThroughputScheduler ��ü�� ������
	}

	void requestElevator(int destination, Direction direction) {
		// ThroughputScheduler�� �̿��� ���������͸� ������
		int selectedElevator = scheduler.selectElevator(this, destination, direction);

		// ���õ� ���������͸� �̵���Ŵ
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}
