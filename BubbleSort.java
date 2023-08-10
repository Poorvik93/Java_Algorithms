import java.util.*;
public class BubbleSort 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the size of array ");
        int []arr=new int[sc.nextInt()];
        System.out.println("Enter the" + (arr.length) +" number to be store in array ");
        //array storing
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println();
// display the array values
        System.out.println("Array before Swapping");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Bubble sort logic
        for (int i=0;i<=arr.length-2;i++)
        {
            for(int j=0;j<=arr.length-2-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        // display the array values after swapping
        System.out.println("Array before Swapping");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}