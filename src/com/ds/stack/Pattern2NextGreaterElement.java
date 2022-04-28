package com.ds.stack;

import java.util.Stack;

public class Pattern2NextGreaterElement {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 4, 9, 7, 10 };
		nextGraterElement(arr);
	}

	public static void nextGraterElement(int[] arr) {
		Stack<Tuple2<Integer, Integer>> st = new Stack<>();
		Integer[] ans = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			ans[i] = -1;
		}

		for (int i = 0; i < arr.length; i++) {
			Integer currentValue = arr[i];
			Integer currentIndex = i;
			while (st.size() > 0 && currentValue > st.lastElement().getT2()) {
				ans[st.lastElement().getT1()] = currentIndex;
				st.pop();
			}

			st.push(new Tuple2<Integer, Integer>(currentIndex, currentValue));
		}
		for (Integer integer : ans) {
			System.out.println(integer);
		}
	}

	static class Tuple2<T1, T2> {
		private T1 t1;
		private T2 t2;

		Tuple2(T1 t1, T2 t2) {
			this.t1 = t1;
			this.t2 = t2;
		}

		public T1 getT1() {
			return this.t1;
		}

		public T2 getT2() {
			return this.t2;
		}

	}

}
