package ex_06;

public class Main {
	public static void main(String[] args) {
		Person p = new Person();
		p.setRole(new Driver());
		p.doIt();
		p.setRole(new Worker());
		p.doIt();
	}
}
