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
	
	private Integer maxDepthBinaryTree(TreeNode<Integer> head){
		if(head == null) {
			return 0;
		}
	
		
		if (head.getLeftChild() == null && head.getRightChild() == null) {
			return 0;
		}

		int leftDepth = 1 + maxDepthBinaryTree(head);
		int rightDepth = 1 + maxDepthBinaryTree(head);
		
		return leftDepth >= rightDepth ? leftDepth : rightDepth;
	}
	
	private void mirrorTree(TreeNode<Integer> head) {
		if (head == null ) {
			return;
		}
		
		
		mirrorTree(head.getLeftChild());
		mirrorTree(head.getRightChild());
		
		TreeNode<Integer> temp = head.getLeftChild();
		head.setLeftChild(head.getRightChild());
		head.setRightChild(temp);
		
		
	}

}
