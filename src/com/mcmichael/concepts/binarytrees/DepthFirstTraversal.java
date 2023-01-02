package com.mcmichael.concepts.binarytrees;

public class DepthFirstTraversal {

	public static void preOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		
		System.out.println(root); // perform some operation to process before its children
		preOrder(root.getLeftChild());
		preOrder(root.getRightChild());
		
	}
	
	public void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		
		preOrder(root.getLeftChild());
		System.out.println(root); // perform some operation to process in between its children
		preOrder(root.getRightChild());
		
	}
	
	public void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		
		preOrder(root.getLeftChild());
		preOrder(root.getRightChild());
		System.out.println(root); // perform some operation to process after its children
	}
}
