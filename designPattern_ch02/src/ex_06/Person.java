package ex_06;

public class Person {
	private Role r;

	public void setRole(Role r) {
		this.r = r;
	}

	public Role getRole() {
		return this.r;
	}

	public void doIt() {
		r.doIt();
	}
}
