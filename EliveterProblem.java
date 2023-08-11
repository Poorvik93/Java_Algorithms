import java.util.Scanner;

public class EliveterProblem {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// creating  the array 
		double [] arr=new double[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weight ");
		double totalWeight=0;
		//storing the array
		for (int i=0;i<=arr.length-1;i++)
			
		{
			//Passenger number
			System.out.print(i+1);
			arr[i]=sc.nextDouble();
			totalWeight+=arr[i];
		}	
		// check the weight for the elevator is operation.
		if (totalWeight>800)
		{
			System.out.println("The elevator cannot operate as the total weight exceeds the limit.");
		}
		else
		{
			System.out.println("The elevator is operational. Have a safe ride!");
		}
	}
}