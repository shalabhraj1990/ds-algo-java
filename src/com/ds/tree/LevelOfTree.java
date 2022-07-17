package com.ds.tree;

public class LevelOfTree {
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
		findLevel(root, -1);
	}

	private static void findLevel(TreeNode root, int parentLevel) {

		if (null != root) {
			int currentLevel = parentLevel + 1;
			System.out.println("level of " + root.val + " is " + currentLevel);
			findLevel(root.left,currentLevel);
			findLevel(root.right,currentLevel);
		}

	}

}
