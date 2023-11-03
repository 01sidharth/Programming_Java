package Array;

import java.util.Scanner;

public class PrimetoLeft {

	public static void check(int[] num) {
		int[] res=new int[num.length];
		int j=0;
		int l=0;
		int m=0;
		for(int i=0;i<num.length;i++) {
			if(prime(num[i]))
			{
				l++;
			}
		}
		int[] prime=new int[l];
		int [] nonprime=new int[num.length-l];
		for(int i=0;i<num.length;i++) {
			if(prime(num[i]))
			{
				res[j]=num[i];
				prime[j]=num[i];
				j++;
			}
		}
		int p=0;
		for(int i=0;i<num.length;i++) {
			if(!prime(num[i]))
			{
				res[j]=num[i];
				nonprime[p]=num[i];
				p++;
				j++;
			}
		}
		PrintArray.print(res);
		PrintArray.print(prime);
		PrintArray.print(nonprime);
	}
	public static boolean prime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		else if(n==2||n==3)
		{
			return true;
		}
		else if(n%2==0||n%3==0)
		{
			return false;
		}
		for(int i=5;i<(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
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
