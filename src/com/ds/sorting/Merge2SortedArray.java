package com.ds.sorting;

import com.ds.resizablearray.ResizeableArray;

public class Merge2SortedArray {
	public static void main(String[] args) {
		
		int[] a = { 3, 6, 7, 9, 34 };
		int[] b = { 1, 5, 6, 7, 9, 36 };
		mergeTwoSortedArray(a,b);
	}

	private static void mergeTwoSortedArray(int[] a, int[] b) {
		ResizeableArray c = new ResizeableArray();
		int i = 0, j = 0, n = a.length, m = b.length;
		while (i < n || j < m) {
			if (i < n && j < m) {
				if (a[i] <= b[j]) {
					c.add(a[i]);
					i++;
				} else {
					c.add(b[j]);
					j++;
				}
			}
			if (i < n) {
				c.add(a[i]);
				i++;
			}
			if (j < m) {
				c.add(b[j]);
				j++;
			}
		}

		c.print();
	}
}
