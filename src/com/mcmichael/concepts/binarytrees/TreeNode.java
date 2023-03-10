package com.mcmichael.concepts.binarytrees;

public class TreeNode<T> {

	private T data;
	private TreeNode<T> leftChild;
	private TreeNode<T> rightChild;
	
	public TreeNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public TreeNode<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return data + "";
	}


	
}
