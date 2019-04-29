package ex_07;

import java.util.Vector;

/*
 * - �׽�Ʈ ����
 *   ���� Student Ŭ������ Course Ŭ������ ���߼��� �ٴ���̹Ƿ�
 *   �� �л��� ������ ��� ������ ���� �� �־�� �ϰ�,
 *   ���������� �� ������ �����ϴ� ��� �л��� ���� �� �־�� �Ѵ�.
 */
public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("manSup");
		Student s2 = new Student("gilDong");
		Course se = new Course("Software Engineering");
		Course designPattern = new Course("Design Pattern");
		// manSup�� ����Ʈ���� ���� ����
		Transcript t1 = new Transcript(s1, se);
		// manSup�� ������ ���� ����
		Transcript t2 = new Transcript(s1, designPattern);
		// gilDong�� ������ ���� ����
		Transcript t3 = new Transcript(s2, designPattern);

		// manSup�� 2012�⿡ ����Ʈ���� ���п��� B0, ������ ���Ͽ��� D+ ���� ���
		t1.setDate("2012");
		t1.setGrade("B0");
		t2.setDate("2012");
		t2.setGrade("D+");

		// gilDong�� 2013�⿡ ������ ���Ͽ��� C+ ���� ���
		t3.setDate("2013");
		t3.setGrade("C+");

		// �� �л��� �����ϴ� ��� ���� Ȯ��
		Vector<Course> courses;
		courses = s1.getCourses();
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i).getName());
		}
		
		System.out.println("================");
		
		// �� ������ �����ϴ� ��� �л� Ȯ��
		Vector<Student> students;
		students = designPattern.getStudents();
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getName());
		}
	}
}
