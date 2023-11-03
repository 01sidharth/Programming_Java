package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

public static int[] check(int[] num) {
	int c=0;
		for(int i=0;i<num.length;i++)
		{	
			boolean b=false;
			for(int j=0;j<num.length-1;j++)
			{	c++;
				if(num[j]>num[j+1])
				{	b=true;
					int temp=num[j];
				       num[j]=num[j+1];
				       num[j+1]=temp;
					
				}				
			}
			if(b==false)
			{
				break;
			}
		}
		System.out.println( c);
		System.out.println("Sorted Array:");
		PrintArray.print(num);
		return num;
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
		check(num);
		sc.close();
	}

}

