package com.ds.hundred;

import java.util.ArrayList;
import java.util.List;

import com.ds.tree.TreeNode;

public class Day15 {
	static List<Integer> resutl = new ArrayList<Integer>();

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
		System.out.println(inorderTraversal(root));

	}

	public static List<Integer> inorderTraversal(TreeNode<Integer> root) {
		if (root != null) {
			inorderTraversal(root.left);
			resutl.add(root.val);
			inorderTraversal(root.right);
		}
		return resutl;
	}
}
