package Strings;

import java.util.Scanner;

public class StringToCharArray{
	public static void print(String str)
	{
		char[] res=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			res[i]=str.charAt(i);
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		//char[] ch=str.toCharArray();
		print(str);
		sc.close();
	}
}
