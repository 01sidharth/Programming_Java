package Strings;

import java.util.Scanner;

public class Reverse_letters {
	public static void check(String str)
	{
		String[] res=str.split("[ /.]");
		for(int i=0;i<res.length;i++)
		{
			res[i]=rev(res[i]);
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}	
	}
	public static String rev(String copy) {
		
		String rem="";
		for(int i=0;i<copy.length();i++)
		{
			rem=copy.charAt(i)+rem;
		}
		return rem;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.nextLine();
		check(str);
		sc.close();
	}
}
