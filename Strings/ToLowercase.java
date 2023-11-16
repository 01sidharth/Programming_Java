package Strings;

import java.util.Scanner;

public class ToLowercase {
	public static void print(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				res=res+(char)(str.charAt(i)+32);
			}
			else
			{
				res=res+str.charAt(i);
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		//System.out.println(str.toLowerCase());  ///Using Special function
		print(str);
		sc.close();
	}

}
