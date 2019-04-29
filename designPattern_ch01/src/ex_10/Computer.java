package ex_10;

import java.util.Vector;

public class Computer {
	private MainBoard mb;
	private Vector<CPU> c;
	private Vector<Memory> m;
	private PowerSupply ps;

	public Computer() {
		this.mb = new MainBoard();
		this.c = new Vector<CPU>();
		this.m = new Memory();
		this.ps = new PowerSupply();
	}
}
