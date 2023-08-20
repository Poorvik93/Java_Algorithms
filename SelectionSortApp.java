package com.kodnest.test;
class SelectionSortApp {

	public static int[] selectionSorting(int arr[]) {
		
		//Selection Sort sort logic
		//Start the loop from 0th index until arr.length-2
		int n=arr.length-1;
		for(int i=0;i<=n-1;i++) {
			//Assuming the arr[i] is the minimum element assigning it to max
			int max =arr[i];
			// Assuming the index i to pos
			int pos=i;
			// Comparing the every element  after i th index ,so j starts from i+1
			for(int j=i+1;j<=n;j++)
			{
//				Comparing and checking whether arr[j]<max. if true replace the max with arr[j] and pos with j
				if(arr[j]>max)
				{
					 max =arr[j];
					 pos=j;
				}
			}
			//Swapping arr[i] with arr[pos]
			
			int temp;
			temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return arr;

	}
}

