package com.ds.slidingwindow;

public class BruteForceSolution {
	public static void main(String[] args) {
		int[] arr = new int[] { 8, 2, 9, 6, 7, 1 };
		int windowSize = 3;
		bruteForce(arr, windowSize);
	}

	private static void bruteForce(int[] arr, int windowSize) {
		for (int i = 0; i <= arr.length- windowSize; i++) {
			int sum = 0;
			for (int j = i; j < i + windowSize; j++) {
				sum += arr[j];
			}
			System.out.println(sum);
		}
	}
}
