package ex_07;

import java.util.Vector;

/*
 * - 테스트 사항
 *   기존 Student 클래스와 Course 클래스의 다중성이 다대다이므로
 *   한 학생이 수강한 모든 과목을 구할 수 있어야 하고,
 *   마찬가지로 한 과목을 수강하는 모든 학생을 구할 수 있어야 한다.
 */
public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("manSup");
		Student s2 = new Student("gilDong");
		Course se = new Course("Software Engineering");
		Course designPattern = new Course("Design Pattern");
		// manSup은 소프트웨어 공학 수강
		Transcript t1 = new Transcript(s1, se);
		// manSup은 디자인 패턴 수강
		Transcript t2 = new Transcript(s1, designPattern);
		// gilDong은 디자인 패턴 수강
		Transcript t3 = new Transcript(s2, designPattern);

		// manSup은 2012년에 소프트웨어 공학에서 B0, 디자인 패턴에서 D+ 학점 취득
		t1.setDate("2012");
		t1.setGrade("B0");
		t2.setDate("2012");
		t2.setGrade("D+");

		// gilDong은 2013년에 디자인 패턴에서 C+ 학점 취득
		t3.setDate("2013");
		t3.setGrade("C+");

		// 한 학생이 수강하는 모든 과목 확인
		Vector<Course> courses;
		courses = s1.getCourses();
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i).getName());
		}
		
		System.out.println("================");
		
		// 한 과목을 수강하는 모든 학생 확인
		Vector<Student> students;
		students = designPattern.getStudents();
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getName());
		}
	}
}
