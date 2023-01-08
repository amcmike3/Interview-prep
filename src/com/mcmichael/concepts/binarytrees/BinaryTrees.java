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
	
	// check if given binary tree is actually a binary search tree
	// This does not work because it will eventually get a null pointer exception 
	// when the head has no child and head.get...Child().getData() is called
	// a implementation to prevent this is to pass a min and max to the method
	// which is just below this method
//	private static boolean isBST(TreeNode<Integer> head) {
//		if (head == null) {
//			return true;
//		}
//		
//		if (head.getLeftChild().getData() <= head.getData() && head.getRightChild().getData() >= head.getData() ) {
//			if(isBST(head.getLeftChild()) && isBST(head.getRightChild())) {
//				return true;
//			}
//		}
//		
//		return false;
//	}
	// as we traverse left max value changes to the current node value
	// as we traverse right the min value changes to the current node value
	private boolean isBinarySearchTree(TreeNode<Integer> head, int min, int max) {
		if (head == null) {
			return true;
		}
		
		if (head.getData() <= min || head.getData() > max) {
			
			return false;
		}

		return isBinarySearchTree(head.getLeftChild(), min, head.getData())
				&& isBinarySearchTree(head, head.getData(), max);
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
