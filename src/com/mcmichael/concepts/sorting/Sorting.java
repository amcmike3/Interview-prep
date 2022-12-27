package com.mcmichael.concepts.sorting;

public class Sorting {
	private HelperMethod help = new HelperMethod();

	public static void main(String[] args) {
		Sorting sort = new Sorting();
		sort.run();
	}
	
	private void run() {
		int[] placeholder = randIntArr(10);
		int[] unsorted = help.copyArray(placeholder);
//		int[] unsorted = {10,9,8,7,6,5,4,3,2,1};
		bubbleSort(unsorted);
		unsorted = help.copyArray(placeholder);
//		unsorted = help.worstCase();
		selectionSort(unsorted);
		unsorted = help.copyArray(placeholder);
//		unsorted = help.worstCase();
		insertionSort(unsorted);
		unsorted = help.copyArray(placeholder);
//		unsorted = help.worstCase();
		shellSort(unsorted);
		
		
	}
	/*
	 * separate original list into many smaller lists and then use insertion sort on the smaller lists
	 * this creates a list that is nearly sorted before a final insertion sort is performed on the nearly sorted list.

	 */
	private void shellSort(int [] unsorted) {
		System.out.println("Shell sort start");
		help.printList(unsorted); 
		int index = 0;
		//start shell sort necessary code:
		int increment = unsorted.length / 2;
		while (increment >= 1) {
			for (int start = 0; start < increment; start++) {
				index += shellInsertionSort(unsorted, start, increment);
			}
			increment = increment /2;
		}
		
		System.out.println("-------------------------------------");
		help.printList(unsorted);
		System.out.println("Shell sort end " + index + " iterations");
		System.out.println("-------------------------------------");
	}
	 // this is a modified version of insertion sort made for shell sort
	// basically use insertion sort for each sublist
	private int shellInsertionSort(int [] unsorted, int start, int increment) {
		int index = 0;

		for (int i = start; i < unsorted.length; i += increment) { 
			for (int j = Math.min(i + increment,unsorted.length -1); j- increment >= 0; j -= increment) {
				if (unsorted[j] < unsorted[ j - increment]) {
					index++;
					help.swap(unsorted, j, j - increment);
					help.printList(unsorted);
				} else {
					break;
				}
			}
		}
		return index;
		
	}
	
	/*
	 * iterate over array comparing the element just outside the sorted portion. 
	 * if the element just outside is less than the last element in the sorted portion, move it over until it is in the correct position.
	 * ie. the element in question is greater than the element imediately to its left in the array.
	 * O(N^2)
	 */
	private void insertionSort(int[] unsorted) {
		System.out.println("Insertion sort start");
		help.printList(unsorted); 
		int index = 0;

		for(int i = 0; i < unsorted.length -1; i++) {
			for (int j = i + 1; j > 0; j-- ) {
				index++;
				if(unsorted[j] < unsorted[j - 1]) {
					help.swap(unsorted, j, j - 1);
					help.printList(unsorted);
				} else {
					break;
				}
			}
		}
		System.out.println("-------------------------------------");
		help.printList(unsorted);
		System.out.println("Insertion sort end " + index + " iterations");
		System.out.println("-------------------------------------");
	}
	
//	Selection sort
//		iterate through array for each index 
//		each time you encounter a smaller number put it in the current index position
//	 O(N^2)
	private void selectionSort(int[] unsorted) {
		System.out.println("Selection Sort start");
		help.printList(unsorted); 
		int index = 0;
		for (int i = 0; i < unsorted.length; i++) {
			for (int j = i; j < unsorted.length; j++) {
				index++; 
				if (unsorted[j] < unsorted[i]) {
					help.swap(unsorted, i, j);
					help.printList(unsorted);
				}
			}
		}
		
		System.out.println("-------------------------------------");
		help.printList(unsorted);
		System.out.println("Selection Sort end " + index + " iterations");
		System.out.println("-------------------------------------");
	}
	
	/* for every pair of two elements in the array we compare and swap them to make the smaller of the two values leftmost.
	 * bubble sort loses out on number of swaps compared to selection sort but average case performs better than selection sort.
	 * this is because it is an adaptive algorithm (it exits if the list is sorted before every iteration has happened)
	 * O(N^2)
	 */
	private void bubbleSort(int[] unsorted) {
		
		System.out.println("Bubble Sort start");
		help.printList(unsorted); 
		int index = 0;
		for (int i =0; i < unsorted.length; i++) {
			boolean swapped = false;
			for (int j = unsorted.length - 1; j > 0; j-- ) {
				index++;
				if (unsorted[j] < unsorted[j - 1]) {
					help.swap(unsorted, j,j-1);
					swapped = true;
				}
				help.printList(unsorted); 
			}
			if (!swapped) {
				break;
			}
		}
		
		System.out.println("-------------------------------------");
		help.printList(unsorted); 
		System.out.println("Bubble Sort end " + index + " iterations");
		System.out.println("-------------------------------------");
	}
	
	/*
	 * generate an array of random numbers that can be used to test sort methods
	 */
	private int[] randIntArr(int num) {
		int[] randArr = new int[num];
		int index = 0;
		for(int i : randArr) {
			int randNum = (int)(Math.random() * 10);
			randArr[index] = randNum;
			index++;
		}
		
		return randArr;
	}
}
