package eNum.ex_01;

public class ToDo {
	private Day currentDay;
	String work;

	public ToDo(Day day) {
		this.currentDay = day;
		work = "�Ϻ� ����";
	}

	public void setDay(Day day) {
		this.currentDay = day;
	}

	public Day getDay() {
		return currentDay;
	}
}
