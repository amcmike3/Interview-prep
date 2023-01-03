package com.mcmichael.concepts.binarytrees;

public class BinarySearchTree {
	public static void main(String[] args) {
		TreeNode<Integer> head = new TreeNode<Integer>(8);
		head.setLeftChild( new TreeNode<Integer>(6));
		head.getLeftChild().setLeftChild(new TreeNode<Integer>(4));
		head.getLeftChild().setRightChild(new TreeNode<Integer>(7));
		head.setRightChild(new TreeNode<Integer>(14));
		head.getRightChild().setRightChild(new TreeNode<Integer>(16));
		head.getRightChild().getRightChild().setRightChild(new TreeNode<Integer>(18));
		
		System.out.println(lookup(head, 14).getData());
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
		}
		if (head.getData() == data) {
			return head;
		}
		
		if (data <= head.getData()) {
			return lookup(head.getLeftChild(), data);
		} else {
			return lookup(head.getRightChild(), data);
		}
		
	}

}
