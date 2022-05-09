package com.ds.queue;

import java.util.ArrayDeque;

public class DeQueueProblem {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 4, 3, 8 };
		int k = 3;
		printMax(arr, k);
	}

	public static void printMax(int[] arr, int k) {
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		int n = arr.length;

		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && arr[i] >= arr[dq.getLast()]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		System.out.println(arr[dq.getFirst()]);
		for (int i = k; i < n ; i++) {
			
			while (!dq.isEmpty() && dq.getFirst() <= i - k ) {
				dq.pop();
			}
			while (!dq.isEmpty() && arr[i ] >= arr[dq.getLast()]) {
				dq.removeLast();
			}
			dq.addLast(i);
			System.out.println(arr[dq.getFirst()]);
		}
	}
}
