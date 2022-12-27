package com.mcmichael.concepts.sorting;

public class Sorting {
	private HelperMethod help = new HelperMethod();

	public static void main(String[] args) {
		Sorting sort = new Sorting();
		sort.run();
	}
	
	private void run() {
		int[] placeholder = randIntArr(10);
//		unsorted = help.copyArray(placeholder);
		int[] unsorted = {10,9,8,7,6,5,4,3,2,1};
		bubbleSort(unsorted);
//		int[] unsorted = help.copyArray(placeholder);
		unsorted = help.worstCase();
		selectionSort(unsorted);
//		unsorted = help.copyArray(placeholder);
		unsorted = help.worstCase();
		insertionSort(unsorted);
		
		
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
