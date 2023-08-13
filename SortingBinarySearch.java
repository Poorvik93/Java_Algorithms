package SortingProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SortingBinarySearch {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of an array : ");
				int [] arr=new int [sc.nextInt()];

				System.out.println("Enter the" + (arr.length) +" number to be store d in array ");
				
				for (int i=0;i<=arr.length-1;i++)
				{
					arr [i]=sc.nextInt();
				}
//				Printing the elements before swapping
				System.out.println("Array before Swapping");
				for (int i=0;i<=arr.length-1;i++)
				{
					System.out.println(arr[i] + " ");
				}
				
				// Sorting array using inbuilt method Arrays.sort
				Arrays.sort(arr);
				
				System.out.println("Enter the key value : " );
				int key=sc.nextInt();
				
				int low =0;
				int high=arr.length-1;
				int mid=(low+high)/2;
				
			    while (low<=high) {
			    	if(key==arr[mid])
			    	{
			    		System.out.println("key found");
			    		return;
			    	}
			    	else if(key >arr[mid])
			    	{
			    		low =mid+1;
			    		high=high;
				    	mid =(low+high)/2;

			    	}
			    	else if(key<arr[mid])
			    	{
			    		low=low;
			    		high=mid-1;
				    	mid =(low+high)/2;

			    	}
			    	
			    }	    		
			    System.out.println("key is not found");


			}
}
