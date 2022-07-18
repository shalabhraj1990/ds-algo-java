package com.ds.tree;

public class SumToLeaf {
	public static void main(String[] args) {
		TreeNode root = new TreeNode<Integer>(10);
		root.left = new TreeNode<Integer>(2);
		root.left.right = new TreeNode<Integer>(3);
		root.left.left = new TreeNode<Integer>(6);

		root.right = new TreeNode<Integer>(8);
		root.right.right = new TreeNode<Integer>(4);
		root.right.left = new TreeNode<Integer>(1);
		root.right.left.left = new TreeNode<Integer>(15);
		root.right.left.right = new TreeNode<Integer>(0);
		sumTillRoot(root, 0);
	}

	private static void sumTillRoot(TreeNode root, int sumTillParent) {
		if (null != root) {
			int sumTillCurrentNode = sumTillParent + (int) root.val;
			if (null == root.left && null == root.right) {
				System.out.println(sumTillCurrentNode);
			}
			sumTillRoot(root.left, sumTillCurrentNode);
			sumTillRoot(root.right, sumTillCurrentNode);
		}

	}

}
