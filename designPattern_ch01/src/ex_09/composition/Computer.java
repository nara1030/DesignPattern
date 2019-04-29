package ex_09.composition;

public class Computer {
	private MainBoard mb;
	private CPU c;
	private Memory m;
	private PowerSupply ps;

	public Computer(MainBoard mb, CPU c, Memory m, PowerSupply ps) {
		this.mb = mb;
		this.c = c;
		this.m = m;
		this.ps = ps;
	}
}
