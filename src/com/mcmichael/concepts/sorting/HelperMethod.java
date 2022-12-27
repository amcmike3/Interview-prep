package com.mcmichael.concepts.sorting;

public class HelperMethod {

	public void swap(int[] unsorted, int i, int j) {
		int temp = unsorted[j];
		unsorted[j] = unsorted[i];
		unsorted[i] = temp;
	}

	public void printList(int[] unsorted) {
		for (int i : unsorted) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
	}
	
	public int[] copyArray(int[] original) {
		int[] copy = new int[original.length];
		int index = 0;
		for (int i : original) {
			copy[index] = original[index];
			index++;
		}
		return copy;
	}
	public int[] worstCase() {
		int[] blah = {10,9,8,7,6,5,4,3,2,1};
		return blah;
	}

}
