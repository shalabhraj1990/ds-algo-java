package com.ds.stack;

import java.util.LinkedList;

public class StackDemo {

	private LinkedList<Integer> arr = null;

	public StackDemo() {
		this.arr = new LinkedList<Integer>();
	}

	public void push(int element) {
			arr.addLast(element);
	}

	public void pop() {
		if (this.arr.size() > 0) {
			arr.removeLast();
		}
	}

	public Integer top() {
		if (this.arr.size() > 0) {
			return arr.getLast();
		}
		return null;
	}

}
