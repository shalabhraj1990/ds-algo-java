package com.ds.TwoPointer;

public class RemoveDublicateElements {
	public static void main(String[] args) {
		int[] arr = new int[] { -19, -19, 2, 6, 7, 7 };
		twoPointer(arr);
	}

	private static void twoPointer(int[] arr) {
		int i = 0;
		int j = 0;
		//if starting element id dpublicate
		if (i == j)
			System.out.println(arr[i]);
		while (i < arr.length - 1 && j < arr.length - 1) {

			if (arr[i] == arr[j])
			{
				j++;	
			}
			
			if (arr[i] != arr[j]) {
				System.out.println(arr[j]);
				i = j;
				
			}

		}

	}

}
