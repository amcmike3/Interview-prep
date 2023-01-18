package com.mcmichael.concepts.heaps;

//minimum heap  is a heap which all nodes below any particular node are greater. 
// in other words the smallest values are highest in the tree.
public class MinHeap<T extends Comparable> extends BinaryHeap<T> {

	public MinHeap(Class<T> clazz) {
		super(clazz);
	}
	
	public MinHeap(Class<T> clazz, int size ) {
		super(clazz, size);
	}

}
