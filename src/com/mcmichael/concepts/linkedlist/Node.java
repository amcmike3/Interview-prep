package com.mcmichael.concepts.linkedlist;

public class Node<T extends Comparable<T>> {

	private T data;
	private Node<T> next;
	
	public Node(T data) {
		this.data = data;
		setNext(null);
	}
	
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return String.valueOf(data);
	}
	
}
