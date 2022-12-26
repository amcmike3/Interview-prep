package com.mcmichael.concepts.sorting;

public class Sorting {

	public static void main(String[] args) {
		Sorting sort = new Sorting();
		sort.run();
	}
	
	private void run() {
		int[] unsorted = randIntArr();
		selectionSort(unsorted);
		unsorted = randIntArr();
		bubbleSort(unsorted);
		
	}
	
	private void bubbleSort(int[] unsorted) {
		HelperMethod help = new HelperMethod();
		System.out.println("Bubble Sort");
		for (int i =0; i < unsorted.length; i++) {
			boolean swapped = false;
			for (int j = unsorted.length - 1; j > 0; j-- ) {
				if (unsorted[j] < unsorted[j - 1]) {
					help.swap(unsorted, j,j-1);
					swapped = true;
				}
			}
			help.printList(unsorted); 
			if (!swapped) {
				break;
			}
		}
		
	}

	private void selectionSort(int[] unsorted) {
		HelperMethod help = new HelperMethod();
		System.out.println("Selection Sort");
		//Selection sort
//		iterate through array for each index 
//		each time you encounter a smaller number put it in the current index position
		for (int i = 0; i < unsorted.length; i++) {
			for (int j = i; j < unsorted.length; j++) {
				if (unsorted[j] < unsorted[i]) {
					help.swap(unsorted, i, j);
					help.printList(unsorted);
				}
			}
		}
		
	}
	
	private int[] randIntArr() {
		int[] randArr = new int[10];
		int index = 0;
		for(int i : randArr) {
			int randNum = (int)(Math.random() * 10);
			randArr[index] = randNum;
			index++;
		}
		
		return randArr;
	}
}
