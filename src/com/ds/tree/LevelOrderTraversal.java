package com.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
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
		funLevelOrderTraversal(root);
	}

	public static void funLevelOrderTraversal(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (q.size() > 0) {
			TreeNode topNode = q.poll();
			System.out.println(topNode.val);
			if (null != topNode.left) {
				q.add(topNode.left);
			}
			if (null != topNode.right) {
				q.add(topNode.right);
			}

		}
	}
}
