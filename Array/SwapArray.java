package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {

	public static void check(int[] num) {
		
		for(int i=0;i<num.length;i++)
		{
			int c=0;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{  int temp=num[i];
				       num[i]=num[j];
				       num[j]=temp;
					
				}				
			}
		}
		System.out.println("Sorted Array:");
		PrintArray.print(num);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int n=sc.nextInt();
		int[] num=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		Arrays.parallelSort(num); //Special Sort Function
		PrintArray.print(num);
		//check(num);
		sc.close();
	}

}

