package Strings;

import java.util.Scanner;

public class IsogramNumber {
	public static boolean check(long num)
	{   long num1=num;
		long num2=num;
		while(num1>0)
		{
			long res1=num1%10;
			num2=num2/10;
			while(num2>0)
			{   long res2=num2%10;
				if(res1==res2)
				{
					return false;
				}
				num2=num2/10;
			}
			num1=num1/10;
			num2=num1;
			
			
			
		}
		return true;
	}
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number");
    	long num=sc.nextLong();
    	System.out.println(check(num));
    	sc.close();
    }
}
