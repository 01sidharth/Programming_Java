package Strings;

import java.util.Scanner;

public class No_of_space {
	public static void check(String str)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				c++;
			}
		}
		System.out.println(c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.nextLine();
		check(str);
		sc.close();
	}

}
