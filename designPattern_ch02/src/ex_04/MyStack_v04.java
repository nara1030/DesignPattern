package ex_04;

import java.util.ArrayList;

/*
 * 책에서는 클래스명이 아래와 같다.
 * MyStackDelegation<String>
 */
public class MyStack_v04<String> {
	private ArrayList<String> arList = new ArrayList<String>();

	private void push(String element) {
		arList.add(element);
	}

	private String pop() {
		return arList.remove(arList.size() - 1);
	}

	private boolean isEmpty() {
		return arList.isEmpty();
	}

	private int size() {
		return arList.size();
	}
}
