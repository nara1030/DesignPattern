package ex_07;

import java.util.Iterator;
import java.util.Vector;

public class Course {
	private String name;
	private Vector<Transcript> transcripts;

	public Course(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}

	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}

	public String getName() {
		return name;
	}

	// 한 과목을 수강하는 모든 학생을 구하기
	// 엄
	public Vector<Student> getStudents() {
		Vector<Student> students = new Vector<Student>();
		Iterator<Transcript> itor = transcripts.iterator();

		while (itor.hasNext()) {
			students.add(itor.next().getStudent());
		}
		return students;
	}

}
