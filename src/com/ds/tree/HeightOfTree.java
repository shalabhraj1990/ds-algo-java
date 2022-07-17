package com.ds.tree;

public class HeightOfTree {
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
		System.out.println("Height of rootNode" + findHeigth(root));

	}

	private static int findHeigth(TreeNode rootNode) {
		if (null != rootNode) {
			int leftHeigth = findHeigth(rootNode.left);
			int rightHeigth = findHeigth(rootNode.right);
			int currentHright = Math.max(leftHeigth, rightHeigth) + 1;
			return currentHright;
		}

		return 0;
	}
}
