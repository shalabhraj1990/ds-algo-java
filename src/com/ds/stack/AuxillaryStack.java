package com.ds.stack;

import java.util.Stack;

public class AuxillaryStack {
	public static void main(String[] args) {
		MinStack minstack = new MinStack();
		minstack.push(5);
		minstack.push(7);
		minstack.push(3);
		System.out.println(minstack.minValue());
		minstack.pop();
		System.out.println(minstack.minValue());

	}

	 static class MinStack {

		private Stack<Integer> stack;
		private Stack<Integer> minStack;

		public MinStack() {
			stack = new Stack<>();
			minStack = new Stack<>();
		}

		public void push(Integer a) {
			stack.push(a);
			if (minStack.size() > 0) {
				if (minStack.peek() > a)
					minStack.push(a);
			} else {
				minStack.push(a);
			}

		}

		public void pop() {

			if (this.stack.size() > 0) {
				stack.pop();
				Integer p1 = stack.peek();
				if (this.minStack.size() > 0) {
					Integer p2 = minStack.peek();
					if (p1 == p2)
						minStack.pop();
				}

			}

		}

		public Integer minValue() {
			return minStack.peek();
		}

	}
}
