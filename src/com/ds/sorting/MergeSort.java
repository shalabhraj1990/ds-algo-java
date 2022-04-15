package com.ds.sorting;

public class MergeSort {
	static int[] scratch = new int[20];

	public static void main(String[] args) {
		int[] arr = { 9, 5, 6, 3, 5, 4 };
		printArray(arr, "betfore ");
		mergeSort(0, arr.length - 1, arr);
		printArray(arr, "after ");
	}

	private static void mergeSort(int startIndex, int endIndex, int[] a) {
		if (startIndex == endIndex)
			return;

		int midIndex = (startIndex + endIndex) / 2;
		mergeSort(startIndex, midIndex, a);
		mergeSort(midIndex + 1, endIndex, a);

		int i = startIndex;
		int j = midIndex + 1;
		int k;

		for (k = startIndex; k <= endIndex; k++)
			scratch[k] = a[k];
		k = startIndex;
		while (k <= endIndex) {
			if (i <= midIndex && j <= endIndex) {
				if (scratch[i] <= scratch[j]) {
					a[k] = scratch[i];
					i++;
				} else {
					a[k] = scratch[j];
					j++;
				}
			}
			else if (i <= midIndex && j > endIndex) {
				a[k] = scratch[i];
				i++;
			} else {
				a[k] = scratch[j];
				j++;
			}
			k++;
		}
	}

	private static void printArray(int[] input, String msg) {
		System.out.println();
		System.out.print(msg + " ");
		for (int i = 0; i < input.length; i++)
			System.out.print(" " + input[i] + " ");
		System.out.println();
	}

}
