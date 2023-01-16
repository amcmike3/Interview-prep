package com.mcmichael.concepts.heaps;

public class BinaryHeap {
	/*
	 * binary heaps need to have pointers to its parent as well as its children.
	 * a better way than storing so many objects with inter-relations to handle this is mathematically.
	 * A Binary heap can be stored inside of an array with the mathematical formulas that follow
	 * to represent the relationships. 
	 * i represents the index of the current node in the tree.
	 * to get the left child: 2*i + 1;
	 * to get the right child: 2*i + 2;
	 * to get the parent: (i-1)/2 ; 
	 * (since there is no fractional division with int in Java, 
	 *  odd numbered indices result in the correct parent regardless of 
	 *  if the parent formula is executed for the right or the left child.) 
	 *  (3.5 is rounded down to 3)
	 */

}
