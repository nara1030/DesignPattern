package ex_06;

import java.util.Vector;

public class Course {
	private String name;
	private Vector<Student> students;

	public Course(String name) {
		this.name = name;
		students = new Vector<Student>();
	}

	public void registerStudent(Student student) {
		students.add(student);
	}

	public void dropStudent(Student student) {
		if (students.contains(student)) {
			students.remove(student);
		}
	}

	public Vector<Student> getStudent() {
		return students;
	}

}
