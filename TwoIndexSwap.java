
package com.kodnest.ArrayPractices;

import java.util.Scanner;

public class TwoIndexSwap {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the number of elements: ");
	    int n = scanner.nextInt();
	    int[] arr = new int[n];

	    System.out.println("Enter the "+ n +" elements:");
	    for (int i = 0; i <= n-1; i++) {
	        arr[i] = scanner.nextInt();
	    }
	    

	    for (int x:arr) {
	        System.out.print(x + " "); 
	    }
	    //
	    System.out.println("After Swapping the elements:");
	    System.out.println("enter the Indexes");
	    int i1=scanner.nextInt();
	    int i2=scanner.nextInt();
	    System.out.println();
	    if(arr[i1]>arr[0] && arr[i2]>arr[0] && arr[i1]<arr.length && arr[i2]<arr.length)  {
		    int temp=arr[i1];
		    arr[i1]=arr[i2];
		    arr[i2]=temp;	    	
	    }

	    System.out.println("Before Swapping elements:");
	    for(int x:arr)
	    {
	    System.out.print(x+" ");
	    }
	    
	    
	}

}
