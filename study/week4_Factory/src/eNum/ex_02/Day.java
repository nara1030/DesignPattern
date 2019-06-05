package eNum.ex_02;

public enum Day {
	MONDAY("������")
	, TUESDAY("ȭ����")
	, WEDNESDAY("������")
	, THURSDAY("�����")
	, FRIDAY("�ݿ���")
	, SATURDAY("�����")
	, SUNDAY("�Ͽ���");
	
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
