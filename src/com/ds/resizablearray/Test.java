package com.ds.resizablearray;

public class Test {
	public static void main(String[] args) {

		ResizeableArray arr = new ResizeableArray();
		arr.add(0);
		arr.add(2);
		arr.add(3);
		arr.add(9);
		arr.add(10);

		arr.print();
		System.out.println("array size:" + arr.size());
	}
}
