package com.ds.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 8, 2, 9, 6, 7, 1 };
		selectioSort(arr);

	}

	public static void selectioSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int smallestIndex = i;
			for (int j = i; j <= arr.length - 1; j++) {
				if (arr[j] < arr[smallestIndex]) {
					smallestIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallestIndex];
			arr[smallestIndex] = temp;
			if (i == 2)
				break;
		}

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
