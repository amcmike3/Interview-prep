package com.mcmichael.concepts.binarytrees;

public class BinaryTrees {
	
	
	private Integer minimumValueInBinarySearchTree(TreeNode<Integer> head){
		if (head == null) {
			return Integer.MIN_VALUE;
		}
		
		if (head.getLeftChild() == null) {
			return head.getData();
		}
		
		
		return minimumValueInBinarySearchTree(head.getLeftChild());
	}

}
