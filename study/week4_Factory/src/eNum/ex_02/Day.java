package eNum.ex_02;

public enum Day {
	MONDAY("월요일")
	, TUESDAY("화요일")
	, WEDNESDAY("수요일")
	, THURSDAY("목요일")
	, FRIDAY("금요일")
	, SATURDAY("토요일")
	, SUNDAY("일요일");
	
	private String name;
	
	Day(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
