package com.ds.binarysearch;

public class BinarySearchOverRange {
	public static void main(String[] args) {
		int number = 9;
		findSqaureRoot(number);
	}

	private static void findSqaureRoot(int number) {

		int start = 1;
		int end = number;
		int ans = number;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (mid * mid > number) {
				end = mid - 1;
			} else if (mid * mid < number) {
				start = mid + 1;
			} else {
				ans = mid;
				System.out.println(ans);
				start = mid + 1;
			}

		}
		System.out.println(end);

	}

}
