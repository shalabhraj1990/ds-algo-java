package com.ds.TwoPointer;

public class IntersectionBtTwoArrays {
	public static void main(String[] args) {
		int[] arr1 = new int[] { -9, -1, 2, 6, 7, 8 };
		int[] arr2 = new int[] { -10, -1, 0, 6, 7, 9 };
		twoPointer(arr1, arr2);
	}

	private static void twoPointer(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;

		while (i < arr1.length - 1 || j < arr2.length - 1) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] == arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
			} else {
				j++;
			}

		}
	}
}
