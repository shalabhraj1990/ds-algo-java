package com.ds.slidingwindow;

import java.util.ArrayDeque;
import java.util.Deque;

public class Greatestnumber_SlidingWindow {
	public static void main(String[] args) {
		int[] arr = new int[] { 8, 2, 9, 6, 7, 1, 10 };
		slidingWindow(arr, 3);
	}

	public static void slidingWindow(int[] arr, int windowSize) {
		int n = arr.length;
		int i,start;
		Deque<Tuple2<Integer, Integer>> deque = new ArrayDeque<>();
		for (i = 0; i < windowSize; i++) {
			while (!deque.isEmpty() && deque.getLast().getT1() < arr[i]) {
				deque.removeLast();
			}
			deque.addLast(new Tuple2<Integer, Integer>(arr[i], i));
		}
		System.out.println(deque.getFirst().getT1());
		start =1;
		for (i = windowSize; i < n; i++) {
			while (!deque.isEmpty() && deque.getFirst().getT2() < start) {
				deque.removeFirst();
			}
			while (!deque.isEmpty() && deque.getLast().getT1() < arr[i]) {
				deque.removeLast();
			}
			deque.addLast(new Tuple2<Integer, Integer>(arr[i], i));
			System.out.println(deque.getFirst().getT1());
			start++;
		}

	}

	public static class Tuple2<T1, T2> {
		private T1 t1;
		private T2 t2;

		public T1 getT1() {
			return t1;
		}

		public T2 getT2() {
			return t2;
		}

		public Tuple2(T1 t1, T2 t2) {
			this.t1 = t1;
			this.t2 = t2;
		}

		@Override
		public String toString() {
			return this.t1 + "," + this.t2;
		}
	}
}
