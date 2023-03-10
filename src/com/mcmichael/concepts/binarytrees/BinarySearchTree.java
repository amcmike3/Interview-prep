package com.mcmichael.concepts.binarytrees;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BinarySearchTree {
	public static void main(String[] args) {
		TreeNode<Integer> head = new TreeNode<Integer>(8);
		insert(head, new TreeNode<Integer>(6));
		insert(head, new TreeNode<Integer>(4));
		insert(head, new TreeNode<Integer>(7));
		insert(head, new TreeNode<Integer>(14));
		insert(head, new TreeNode<Integer>(16));
		insert(head, new TreeNode<Integer>(18));
		
		System.out.println(lookup(head, 14));
		BinaryTrees.printTree(head);
	}
	

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

	public static TreeNode<Integer> lookup(TreeNode<Integer> head, int data){
		if (head == null) {
			return null;
		} else if (head.getData() == data) {
			return head;
		}else if (data <= head.getData()) {
			return lookup(head.getLeftChild(), data);
		} else {
			return lookup(head.getRightChild(), data);
		}
		
	}
	
	
	
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
