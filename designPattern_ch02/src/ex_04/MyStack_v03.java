package ex_04;

import java.util.ArrayList;

public class MyStack_v03<String> {
	private ArrayList<String> arList = new ArrayList<String>();

	private void push(String element) {
		arList.add(element);
	}

	private String pop() {
		return arList.remove(arList.size() - 1);
	}
}
