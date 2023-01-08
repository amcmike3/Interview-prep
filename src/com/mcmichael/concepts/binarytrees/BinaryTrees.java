package com.mcmichael.concepts.binarytrees;

public class BinaryTrees {
	
	// find the smallest value within a Binary Search Tree
	private Integer minimumValueInBinarySearchTree(TreeNode<Integer> head){
		if (head == null) {
			return Integer.MIN_VALUE;
		}
		
		if (head.getLeftChild() == null) {
			return head.getData();
		}
		
		
		return minimumValueInBinarySearchTree(head.getLeftChild());
	}
	
//	find the deepest level of the given tree
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
	
	//reverse all node in a given tree so tree become mirror of the original
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
	
	//count the total number of structurally unique trees can be created given a number of nodes
	private int countTrees(int numNodes) {
		if (numNodes <= 1 ) {
			return 1;
		}
		int sum = 0;
		for (int i = 1; i <= numNodes; i++) {
			int countLeftTrees = countTrees(i - 1);
			int countRightTrees = countTrees(numNodes - 1);
			sum += countLeftTrees * countRightTrees;
			
		}
		
		return sum;
	}
	
	//print all values in a Binary Search Tree that are within a specified range inclusive
	private void printNodesInRange(TreeNode<Integer> head, Integer low, Integer high) {
		if (head == null) {
			return;
		}
		
		if (head.getData() >= low && head.getData() <= high) {
			System.out.println(head.getData());
		}
		
		if(head.getData() >= low) {
			printNodesInRange(head.getLeftChild(), low, high);
		}
		
		if(head.getData() <= high) {
			printNodesInRange(head.getRightChild(), low, high);
		}
	}

}
