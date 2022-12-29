package com.mcmichael.concepts.stacksandqueues;

import com.mcmichael.concepts.linkedlist.Node;

public class Element<T> {


	private T data;
	private Element next;
	
	public Element(T data, Element next) {
		this.data = data;
		this.next = next;
	}
	
	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
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
