package ex_04;

public class Professor {
	private Student student;

	public void setStudent(Student student) {
		this.student = student;
		student.setAdvisor(this);
	}

	public void advise() {
		student.advisor("��� ������ ���⿡...");
	}
	
}
