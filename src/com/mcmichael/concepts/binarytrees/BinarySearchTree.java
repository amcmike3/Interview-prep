package com.mcmichael.concepts.binarytrees;

public class BinarySearchTree {
	public static TreeNode<Integer> insert(TreeNode<Integer> head, TreeNode<Integer> node){
		if (head == null) {
			return node;
		}
		
		if (node.getData() <= head.getData()) {
			head.setLeftChild(insert(head.getLeftChild(), node));
		} else {
			head.setRightChild(insert(head.getRightChild(), node));
		}
		
		return head;
	}

}
