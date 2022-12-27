package com.mcmichael.concepts.sorting;

public class HelperMethod {
	
	
	public void merge(int[] unsorted, int[] firstHalf, int[] secondHalf) {
		int mergeIndex = 0 ;
		int firstIndex = 0;
		int secondIndex = 0;
		
		while( firstIndex < firstHalf.length && secondIndex < secondHalf.length) {
			if (firstHalf[firstIndex] < secondHalf[secondIndex]) {
				unsorted[mergeIndex] = firstHalf[firstIndex];
				firstIndex++;
			} else if (secondIndex < secondHalf.length){
				unsorted[mergeIndex] = secondHalf[secondIndex];
				secondIndex++;
			}
			mergeIndex++;
		}
		if (firstIndex < firstHalf.length) {
			while ( mergeIndex < unsorted.length) {
				unsorted[mergeIndex++] = firstHalf[firstIndex++];
			}
		}
		if (secondIndex < secondHalf.length) {
			while (mergeIndex < unsorted.length) {
				unsorted[mergeIndex++] = secondHalf[secondIndex++];
			}
		}
		
	}
	
	public void split(int[] unsorted, int[] firstHalf, int[] secondHalf) {
		int index = 0;
		int secondIndex = firstHalf.length;
		for (int element : unsorted) {
			if(index < secondIndex) {
				firstHalf[index] = unsorted[index];
			} else {
				secondHalf[index - secondIndex] = unsorted[index];
			}
			index++;
		}
	}
	
	

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
