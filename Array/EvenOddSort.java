package Array;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSort {
	public static int[] sort(int[] num) {
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{  int temp=num[i];
				       num[i]=num[j];
				       num[j]=temp;
					
				}				
			}
		}
		System.out.println("Sorted Array");
		PrintArray.print(num);
		//                           System.out.println(Arrays.toString(num));
		return num;
	}
	public static int[] convert(int[] num)
	{
		sort(num);
		int[] res=new int[num.length];
		int x=0;//even
		int y=num.length-1;//odd
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				res[x]=num[i];
				x++;
			}
			else
			{
				res[y]=num[i];
				y--;
			}
		}
		System.out.println("Even odd Array:");
		PrintArray.print(res);
		return res;
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
		
		convert(num);
		sc.close();
	}

}
