package main;

import java.util.Arrays;

public class ExampleSorting {

	public static void main(String[] args) {
		int[] array = {3, 1, 6, 2, 5, 0};
		// 0 1 2 3 5 6
		
		System.out.println(Arrays.toString(array));
		sortUsingInsertionSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	private static void sortUsingInsertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (array[j] < temp) {
					break;
				}
				
				array[j + 1] = array[j];
			}
			
			array[j + 1] = temp;
		}
	}
	
	
	private static void sortUsingBubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = array.length - 2; j >= 0; j--) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	private static void sortUsingSelectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = findSmallestElementInRange(array, i);
			
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}
	
	/**
	 * Finds the index of the smallest element in the
	 * given range [startIndex, array.length).
	 */
	public static int findSmallestElementInRange(int[] array, int startIndex) {
		int minIndex = startIndex;
		for (int i = startIndex; i < array.length; i++) {
			if (array[i] < array[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;
	}

}
