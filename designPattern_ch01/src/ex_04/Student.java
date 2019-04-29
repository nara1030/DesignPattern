package ex_04;

public class Student {
	private Professor advisor;

	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}

	public void advisor(String msg) {
		System.out.println(msg);
	}
	
	// Ãß°¡ 
	public Professor getAdvisor() {
		return advisor;
	}
}
