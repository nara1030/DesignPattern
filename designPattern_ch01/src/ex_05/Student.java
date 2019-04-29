package ex_05;

import java.util.Vector;

/*
 * 1. ex_04���� ������
 *  - ������ ���(��������)�� �л��� �������� �� set �޼����� �Ű������� �л� ����
 *  - �㳪 �� ��� set �޼��� ��� ������ ����߰� �Ű������� ���� ���޹��� ����
 *  - �� ������ register �� drop �޼��忡�� �� ������ ����ϱ� ����
 *  - 1���� ���迡�� �ַ� ���̴� ���ϰ���
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
