package com.kodnest.test;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the " +arr.length+ "element to Store in array");
		//Storing the element in the Array
		for (int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//Array BEfore Sorting is the array
		System.out.println("Array Before Sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		int[] arraysorting=SelectionSortApp.selectionSorting(arr);
		// printing the array after swapping
		System.out.println("Array after Sorting");
		for (int i=0;i<=arraysorting.length-1;i++)
		{
			System.out.print(arraysorting[i] + " ");
		}
		
	}

}

