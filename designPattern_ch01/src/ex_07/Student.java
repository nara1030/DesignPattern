package ex_07;

import java.util.Iterator;
import java.util.Vector;

public class Student {
	private String name;
	private Vector<Transcript> transcripts;

	public Student(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}

	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	public String getName() {
		return name;
	}

	// �� �л��� ������ ��� ���� ���ϱ�
	// ��
	public Vector<Course> getCourses1() {
		Vector<Course> courses = new Vector<Course>();
		// �Ʒ��� ���� �ڵ�
		// Vector<Course> courses = null;
		for (int i = 0; i < transcripts.size(); i++) {
			courses.add(i, transcripts.get(i).getCourse());
		}
		return courses;
	}

	// å
	public Vector<Course> getCourses() {
		Vector<Course> courses = new Vector<Course>();
		Iterator<Transcript> itor = transcripts.iterator();

		while (itor.hasNext()) {
			Transcript tr = itor.next();
			courses.add(tr.getCourse());
		}
		return courses;
	}

}
