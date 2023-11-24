package Strings;

import java.util.Scanner;

public class Min_Palindrome {
	public static int check(String str)
	{   int d=0;
		String temp=str;
		if(pal(str))
		{
			return 0;
		}
		else
		{   int c=0;
			String str1="";
			for(int i=0;i<str.length();i++)
			{
				str1=str.charAt(i)+str1;
			}
			do
			{   temp=str;
				String temp1="";
				for(int i=str1.length()-1;i>=(str1.length()-1)-c;i--)
				{
					temp1=str1.charAt(i)+temp1;
				}
				c++;
				temp=temp+temp1;
				d++;
			}
			while(!(pal(temp)));
		}
		System.out.println("Resulting Palindrome String:->"+temp);
		return d;
	}
	public static boolean pal(String str)
	{   int j=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			
				if(str.charAt(i)!=str.charAt(j))
				{
					return false;
				}
				j--;
			
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.nextLine();
		System.out.println("Result:->"+check(str));
		sc.close();
	}

}
