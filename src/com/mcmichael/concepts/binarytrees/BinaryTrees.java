package com.mcmichael.concepts.binarytrees;

public class BinaryTrees {
	

	
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
	
	public static void printTree(TreeNode<Integer> head) {
		if (head == null ) {
			return;
		}
		System.out.println(head);
		printTree(head.getLeftChild());
		printTree(head.getRightChild());
		
		
		
	}

}
