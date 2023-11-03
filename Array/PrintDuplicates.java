package Array;

import java.util.Scanner;

public class PrintDuplicates {
	public static void check(int[] num) {
		System.out.println("duplicates:");
		for(int i=0;i<num.length;i++)
		{
			int c=0;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{   c++;
					
				}				
			}
			if(c>0)
			{
				System.out.print(num[i]+" ");
			}
		}
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
