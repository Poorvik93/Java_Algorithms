package SortingProblems;

import java.util.Scanner;

public class BubbleSort {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of an array : ");
			int [] arr=new int [sc.nextInt()];

			System.out.println("Enter the" + (arr.length) +" number to be store in array ");
			
			for (int i=0;i<=arr.length-1;i++)
			{
				arr [i]=sc.nextInt();
			}
//			Printing the elements before swapping
			System.out.println("Array before Swapping");
			for (int i=0;i<=arr.length-1;i++)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			//Bubble sort
			for(int i=0;i<=arr.length-2;i++) {
				for(int j=0;j<=arr.length-i-2;j++)
				{
					if(arr[j]>arr[j+1])
					{
						  int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;					
					}
				}
			}
			System.out.println();
			System.out.println("Array after Sorting");
			for (int i=0;i<=arr.length-1;i++)
			{
				System.out.print(arr[i] + " ");
			}
			
	}

}
