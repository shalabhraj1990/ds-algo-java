package com.ds.TwoPointer;

public class SqOfNumbers {
	public static void main(String[] args) {
		int[] arr = new int[] {  -9,-1, 2, 6, 7, 8 };
		twpPointer(arr);
	}

	private static void twpPointer(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			if (arr[i] * arr[i] >= arr[j] * arr[j]) {
				System.out.println(arr[i] * arr[i]);
				i++;
			} else {
				System.out.println(arr[j] * arr[j]);
				j--;
			}
		}
	}
}
