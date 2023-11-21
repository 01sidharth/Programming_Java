package Strings;

import java.util.Scanner;

public class Reverse_words {
	public static void check(String str)
	{
		String[] res=str.split("[ /.]");
		for(int i=res.length-1;i>=0;i--)
		{
			System.out.print(res[i]+" ");
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.nextLine();
		check(str);
		sc.close();
	}
}
