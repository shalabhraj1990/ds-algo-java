package com.ds.queue;

import java.util.ArrayDeque;

public class QueueProblem {
	public static void main(String[] args) {
		ArrayDeque<String> que = new ArrayDeque<String>();
		que.addLast("0");
		que.addLast("1");
		int n = 10;
		for (int i = 0; i <= 10; i++) {
			String top = que.pop();
			System.out.println(top);
			que.addLast(top + "0");
			que.addLast(top + "1");
		}
	}
}
