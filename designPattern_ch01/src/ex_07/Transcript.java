package ex_07;

/*
 * �ٴ�� -> �ϴ��
 * ���� Ŭ������ �Ϲ� Ŭ������ ��ȯ
 * ����1. ����
 *  - Student �� Course �������� �÷����� ���� �����ȴ�.
 *  - �̰� Ư����, Ư������ ���� ������� Student Ȥ�� Course ��� �������־���
 *    ������� ���� �� ����(�� �κп��� ���� ����)
 * ����2. ������ or Set �޼���
 *  - ������Ű���� set �޼��� ����ؾ� �Ѵٰ� �����ߴµ� å���� ������ ���
 */

public class Transcript {
	private Student student;
	private Course course;
	private String date;
	private String grade;
	
	public Transcript(Student student, Course course) {
		this.student = student;
		this.student.addTranscript(this);
		this.course = course;
		this.course.addTranscript(this);
	}
	
	public Student getStudent() {
		return student;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}
}
