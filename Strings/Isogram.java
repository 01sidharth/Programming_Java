package Strings;

import java.util.Scanner;

public class Isogram {
	public static boolean check(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println(check(str));
		sc.close();
	}

}
