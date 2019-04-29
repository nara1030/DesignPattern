package ex_06;

import java.util.Vector;

/*
 * 1. ex_04 ����
 *  - ������ ��� �л��� �߰�
 *  - ���ÿ� �л��� ��� ���� ������ �߰�
 *  - ������ ���� �ν�(����� ���� ����)  
 * 2. ex_05���� ����
 *  - �Ϲ������� �ٴ�� ���� ����(ex_06)�� ����� ���� ����� ǥ���Ǵ� ���� ����
 *  - �� ������
 * 3. ��ü �׽�Ʈ
 *  -
 * 4. ������ ��������
 *  4-1. ���߼��� �ٴ���� ��� ���� �Ӽ��� Vector �̿�
 *  4-2. �ٴ�� ���� ����� ����� ���� �����̹Ƿ� ���� ����
 *   - ���� �ϴ�� �ܹ��� ���� ����� ��ȯ�� ���� 
 *   - �̸� ���� ���� Ŭ����(association class) �ʿ�
 *   - ��. ���� ����
 *   - ���� ������ Student Ȥ�� Course Ŭ������ �� �� ����
 *   - ���� ������ Student�� Course��� �� Ŭ������ ��ü�� �����ؾ߸� ��ġ ����
 * 5. ���� Ŭ���� ���� ���
 *  - ��. ȫ�浿�� 2013�⿡ ������ ������ ���Ͽ��� A�� �޾Ҵ�.
 *  - Ŭ���� ����: Student, Course, Transcript(����)
 *  - Transcript ��ü: Student�� Course ��ü�� ������Ű�� ��ü
 *  - ���� �� ��ü�� ������ �� �ִ� �Ӽ� �����ؾ� ��
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

	// Ȯ�� ���� �߰�(å������ Course�� �߰�)
	public String getName() {
		return name;
	}
}
