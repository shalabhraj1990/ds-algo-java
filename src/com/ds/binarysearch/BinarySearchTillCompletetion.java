package com.ds.binarysearch;

public class BinarySearchTillCompletetion {
	public static void main(String[] args) {
		// First occurancess
		int[] arr = new int[] { 1, 5, 5, 5, 6, 7, 8, 8,  8, 20 };
		int key = 5;
		binarySearch(arr, key);
	}

	private static void binarySearch(int[] arr, int key) {

		int start = 0;
		int end = arr.length - 1;
		int ans = 5;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] > key) {
				end = mid - 1;
			} else if (arr[mid] < key) {
				start = mid + 1;
			} else {
				ans = mid;
				end = mid - 1;
				//start = mid + 1;
			}
		}

		System.err.println(ans);

	}
}
