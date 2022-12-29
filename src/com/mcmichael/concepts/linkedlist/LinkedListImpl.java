package com.mcmichael.concepts.linkedlist;

public class LinkedListImpl {

	public int countNodes() {
		if (head == null) {
			return 0;
		} else {
			Node<T> curr = head;
			int count = 0;
			while (curr != null) {
				curr = curr.getNext();
				count++;
			}
			return count;
		}
	}

}
