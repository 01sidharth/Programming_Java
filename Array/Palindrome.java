package Array;

import java.util.Scanner;

public class Palindrome {
	public static int check(int [] num)
	{
	  for(int i=0;i<num.length;i++)
	  {
		  if(!pal(num[i]))
		  {
			  return 0;
		  }
	  }
	  return 1;
	}
	public static boolean pal(int n)
	{   int t=n;
		int rem=0;
		int res=0;
		while(t>0)
		{
			rem=t%10;
			res=res*10+rem;
			t=t/10;
		}
		if(n==res)
		{
			return true;
		}return false;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sixe of the Array:");
		int n=sc.nextInt();
		int[] num=new int[n];
		System.out.println("enter the Elements of the array:");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println(check(num));
		sc.close();
	}

}
