package Array;

import java.util.Scanner;

public class IndexElementSame {
	public static boolean check(int [] num1,int[] num2)
	{
		for(int i=0;i<num1.length;i++)
		{
			if(num1[i]!=num2[i])
			{
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int n=sc.nextInt();
		int[] num1=new int[n];
		System.out.println("Enter the Elements of num1");
		for(int i=0;i<n;i++)
		{
			num1[i]=sc.nextInt();
		}
		int[] num2=new int[n];
		System.out.println("Enter the Elements of num2");
		for(int i=0;i<n;i++)
		{
			num2[i]=sc.nextInt();
		}
		
		System.out.println(check(num1,num2));
		sc.close();
	}

}
