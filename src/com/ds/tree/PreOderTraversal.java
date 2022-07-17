package com.ds.tree;

public class PreOderTraversal {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.left.right.left = new TreeNode(4);
		root.left.right.right = new TreeNode(5);

		root.right = new TreeNode(2);
		root.right.right = new TreeNode(7);
		root.right.right.left = new TreeNode(8);
		root.right.right.left.left = new TreeNode(9);
		funPreOderTraversal(root);
	}
	
	public static void funPreOderTraversal(TreeNode root) {
		if(null != root) {
			System.out.println(root.val);
			funPreOderTraversal(root.left);
			funPreOderTraversal(root.right);
		}
		
	}

}
