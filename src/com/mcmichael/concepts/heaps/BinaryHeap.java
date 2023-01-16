package com.mcmichael.concepts.heaps;

import java.lang.reflect.Array;

public abstract class BinaryHeap<T extends Comparable> {
	/*
	 * A BINARY HEAP IS THE BEST REPRESENTATION FOR A PRIORITY QUEUE
	 * 
	 * binary heaps need to have pointers to its parent as well as its children. a
	 * better way than storing so many objects with inter-relations to handle this
	 * is mathematically. A Binary heap can be stored inside of an array with the
	 * mathematical formulas that follow to represent the relationships. i
	 * represents the index of the current node in the tree. to get the left child:
	 * 2*i + 1; to get the right child: 2*i + 2; to get the parent: (i-1)/2 ; (since
	 * there is no fractional division with int in Java, odd numbered indices result
	 * in the correct parent regardless of if the parent formula is executed for the
	 * right or the left child.) (3.5 is rounded down to 3)
	 */

	private static int MAX_SIZE = 40;
	private T[] array;
	private int count = 0;

	public BinaryHeap(Class<T> clazz) {
		this(clazz, MAX_SIZE);
	}

	public BinaryHeap(Class<T> clazz, int size) {
		array = (T[]) Array.newInstance(clazz, size);
	}

	public int getLeftChildIndex(int index) {
		int leftChildIndex = 2 * index + 1;
		if (leftChildIndex >= count) {
			return -1;
		}
		return leftChildIndex;
	}

	public int getRightChildIndex(int index) {
		int rightChildIndex = 2 * index + 2;
		if (rightChildIndex >= count) {
			return -1;
		}
		return rightChildIndex;
	}

	public int getParentIndex(int index) {
		if (index < 0 || index > count) {
			return -1;
		}
		return (index - 1) / 2;
	}

}
