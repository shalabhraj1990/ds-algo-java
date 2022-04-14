package com.ds.resizablearray;

public class ResizeableArray {
	private int[] arr;
	private int size;
	private int capacity;

	public ResizeableArray() {
		arr = new int[2];
		size = 0;
		capacity = 2;
	}

	public void add(int ele) {
		if (size < capacity) {
			arr[size] = ele;
			size++;
		} else {
			int[] newarr = new int[capacity * 2];
			for (int i = 0; i <= size - 1; i++) {
				newarr[i] = arr[i];
			}
			capacity = capacity * 2;
			newarr[size] = ele;
			size++;
			arr = newarr;
		}
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	public int size() {
		return this.arr.length;
	}

}
