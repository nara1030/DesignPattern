package ex_07;

/*
 * 다대다 -> 일대다
 * 연관 클래스를 일반 클래스로 변환
 * 생각1. 검증
 *  - Student 및 Course 생성자의 컬렉션이 따로 생성된다.
 *  - 이게 특정인, 특정과목에 대한 점수라면 Student 혹은 Course 어디서 설정해주었건
 *    관계없이 같은 값 추출(이 부분에서 생각 막힘)
 * 생각2. 생성자 or Set 메서드
 *  - 연관시키려면 set 메서드 사용해야 한다고 생각했는데 책에선 생성자 사용
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
