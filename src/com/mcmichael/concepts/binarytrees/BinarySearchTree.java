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
	public static TreeNode<Integer> myLookUp(TreeNode<Integer> head, Integer data){
		TreeNode<Integer> ans = null;
		while (head.getData() != null || head.getData() != data) {
			if(head.getData() <= data) {
				head = head.getLeftChild();
			} else {
				head = head.getRightChild();
			}
		}
		
		return ans;
		
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
