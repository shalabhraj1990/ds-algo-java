package com.ds.hundred;

import java.util.Stack;

public class Day16_MinStack {
	public Stack<Integer> a, b;

	public Day16_MinStack() {
		a = new Stack<>();
		b = new Stack<>();
	}

	public void push(int val) {
		a.push(val);
		if (b.empty() || val <= b.peek()) {
			b.push(val);
		}
	}

	public void pop() {
		if (!a.empty()) {

			if (a.peek().equals(b.peek())) {
				b.pop();
			}
			a.pop();
		}
	}

	public int top() {
		return a.peek();
	}

	public int getMin() {
		return b.peek();
	}
}
