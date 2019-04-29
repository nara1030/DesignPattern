package ex_06;

import java.util.Vector;

/*
 * 1. ex_04 참고
 *  - 교수가 담당 학생을 추가
 *  - 동시에 학생도 담당 지도 교수가 추가
 *  - 서로의 존재 인식(양방향 연관 관계)  
 * 2. ex_05와의 차이
 *  - 일반적으로 다대다 연관 관계(ex_06)은 양방향 연관 관계로 표현되는 것이 적절
 *  - 그 이유는
 * 3. 자체 테스트
 *  -
 * 4. 多대多 연관관계
 *  4-1. 다중성이 다대다일 경우 참조 속성은 Vector 이용
 *  4-2. 다대다 연관 관계는 양방향 연관 관계이므로 구현 복잡
 *   - 따라서 일대다 단방향 연관 관계로 변환해 구현 
 *   - 이를 위해 연관 클래스(association class) 필요
 *   - 예. 성적 정보
 *   - 성적 정보는 Student 혹은 Course 클래스에 둘 수 없음
 *   - 성적 정보는 Student와 Course라는 두 클래스의 객체가 존재해야만 가치 있음
 * 5. 연관 클래스 구현 방법
 *  - 예. 홍길동은 2013년에 개설한 디자인 패턴에서 A를 받았다.
 *  - 클래스 추출: Student, Course, Transcript(성적)
 *  - Transcript 객체: Student와 Course 객체를 연관시키는 객체
 *  - 따라서 두 객체를 참조할 수 있는 속성 포함해야 함
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
		course.registerStudent(this);
	}

	public void dropCourse(Course course) {
		if (courses.contains(course)) {
			courses.remove(course);
			course.dropStudent(this);
		}
	}

	public Vector<Course> getCourses() {
		return courses;
	}

	// 확인 위해 추가(책에서는 Course에 추가)
	public String getName() {
		return name;
	}
}
