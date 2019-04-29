package ex_05;

import java.util.Vector;

/*
 * 1. ex_04와의 차이점
 *  - 교수가 상담(연관관계)할 학생을 지정해줄 때 set 메서드의 매개변수로 학생 설정
 *  - 허나 이 경우 set 메서드 대신 생성자 사용했고 매개변수로 과목 전달받지 않음
 *  - 그 이유는 register 및 drop 메서드에서 그 역할을 대신하기 때문
 *  - 1대多 관계에서 주로 보이는 패턴같음
 */

public class Student {
	private String name;
	private Vector<Course> courses;

	public Student(String name) {
		this.name = name;
		courses = new Vector<Course>();
	}

	public void registerCourse(Course course) {
		courses.add(course);
	}

	public void dropCourse(Course course) {
		if (courses.contains(course)) {
			courses.remove(course);
		}
	}

	public Vector<Course> getCourses() {
		return courses;
	}
}
