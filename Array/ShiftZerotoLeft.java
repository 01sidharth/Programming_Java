package Array;

import java.util.Scanner;

public class ShiftZerotoLeft {
	public static void shift(int[] num) {
		int [] res=new int[num.length];
		int j=num.length-1;
		for(int i=num.length-1;i>=0;i--) 
		{
			if(num[i]!=0) 
			{
				res[j]=num[i];
				j--;
			}
		}
		PrintArray.print(res);
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
	shift(num);
	sc.close();
}
}
