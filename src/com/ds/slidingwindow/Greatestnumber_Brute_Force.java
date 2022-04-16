package com.ds.slidingwindow;

public class Greatestnumber_Brute_Force {
	public static void main(String[] args) {
		int[] arr = new int[] { 8, 2, 9, 6, 7, 1, 10 };
		geatestNumberInWindow(arr, 3);
	}

	private static void geatestNumberInWindow(int[] arr, int windowSize) {
		int n = arr.length;
		for (int i = 0; i <= n - windowSize; i++) {

			int maxValueForWindow = arr[i];
			for (int j = i; j < i + windowSize; j++) {
				if (arr[j] > maxValueForWindow) {
					maxValueForWindow = arr[j];
				}
			}
			System.out.println(maxValueForWindow);

		}
	}
}
