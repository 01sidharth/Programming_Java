package Array;

import java.util.Scanner;

public class MaxElement {
	public static int check(int []num)
	{  // int min=num[0];
		int max=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>max) 
		  //if(num[i]<min) Smallest  Element
			{
				max=num[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of the Array:");
	int n=sc.nextInt();
	int[] num=new int[n];
	System.out.println("enter the Elements of the array:");
	for(int i=0;i<n;i++)
	{
		num[i]=sc.nextInt();
	}
	System.out.println("largest element :"+check(num));
	sc.close();
	}

}
