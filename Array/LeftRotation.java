package Array;

import java.util.Scanner;

public class LeftRotation {
	public static void leftrot(int[] num)
	{
		int first=num[0];
		for(int i=0;i<num.length-1;i++)
		{
			num[i]=num[i+1];
		}
		num[num.length-1]=first;
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
	}
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size of the Array:");
	int n=sc.nextInt();
	int[] num=new int[n];
	System.out.println("enter the Elements");
	for(int i=0;i<n;i++)
	{
		num[i]=sc.nextInt();
	}
	leftrot(num);
	sc.close();
}
}
