package com.ds.binarysearch;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = new int[] { -10, -1, 0, 6, 7, 9, 10 };
		int key = 11;
		binarySearch(arr, key);
	}

	private static void binarySearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] > key) {
				end = mid - 1;
			} else if (arr[mid] < key) {
				start = mid + 1;
			} else {
				System.out.println("key found " + arr[mid]);
				return;
			}
		}
		System.out.println("Key not found");

	}
}
