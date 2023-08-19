package com.kodnest.test;

public class InsertionSortApp {

	    public static void insertionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; i++) {
	            int item = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > item) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = item;
	        }

	}

}
