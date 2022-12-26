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

}
