package Strings;

import java.util.Scanner;

public class Length_of_lastword {
	public static void check(String str)
	{
		int c=0;
		for(int i=str.length()-1;i>0;i--)
		{
			if(str.charAt(i)!=' ')
			{
				c++;
			}
			else
			{
				break;
			}
		}
		System.out.println("length of last word"+c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.nextLine();
		check(str);
		sc.close();
	}
}
