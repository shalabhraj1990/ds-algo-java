package com.ds.tree;

public class IdenticalTree {
	public static void main(String[] args) {
		TreeNode tree1 = new TreeNode<String>("A");
		tree1.left = new TreeNode<String>("B");
		tree1.left.right = new TreeNode<String>("H");
		tree1.left.left = new TreeNode<String>("G");

		tree1.right = new TreeNode<String>("C");
		tree1.right.right = new TreeNode<String>("E");
		tree1.right.left = new TreeNode<String>("D");
		tree1.right.left.left = new TreeNode<String>("F");
		
		TreeNode tree2 = new TreeNode<String>("A");
		tree2.left = new TreeNode<String>("B");
		tree2.left.right = new TreeNode<String>("H");
		tree2.left.left = new TreeNode<String>("G");

		tree2.right = new TreeNode<String>("C");
		tree2.right.right = new TreeNode<String>("E");
		tree2.right.left = new TreeNode<String>("D");
		tree2.right.left.left = new TreeNode<String>("O");
		
		System.out.println(isTreeIdentical(tree1,tree2));

	}
	
	private static boolean isTreeIdentical(TreeNode t1,TreeNode t2) {
		if(null != t1 && null == t2) {
			return false;
		}
		if(null == t1 && null != t2) {
			return false;
		}
		if(null == t1 && null == t2) {
			return true;
		}
		if(null != t1 && null != t2) {
			return t1.val == t2.val && isTreeIdentical(t1.left,t2.left) && isTreeIdentical(t1.right,t2.right);
		}
		return false;
	}
}
