package com.ds.tree;

public class TotalLeafeNodes {
	public static void main(String[] args) {
		TreeNode root = new TreeNode<String>("A");
		root.left = new TreeNode<String>("B");
		root.left.right = new TreeNode<String>("H");
		root.left.left = new TreeNode<String>("G");

		root.right = new TreeNode<String>("C");
		root.right.right = new TreeNode<String>("E");
		root.right.left = new TreeNode<String>("D");
		root.right.left.left = new TreeNode<String>("F");

		// root = root.left;
		System.out.println(funcTotalLeafeNodes(root));
	}

	private static int funcTotalLeafeNodes(TreeNode root) {
		if (null != root) {
			if (null != root.left && null != root.right) {
				int noOfLeafNodes = funcTotalLeafeNodes(root.left) + funcTotalLeafeNodes(root.right);
				return noOfLeafNodes;
			} else
				return 1;
		}
		return 0;
	}
}
