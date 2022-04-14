package com.ds.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 8, 2, 9, 6, 7, 1 };
		bubbleSort(arr);

	

	}

	public static void bubbleSort(int[] arr) {
		int size = arr.length;
		for (int i = size - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
				
			}
//			if (i == size - 3)
//				break;
		}
		
		for(int i= 0;i< arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
