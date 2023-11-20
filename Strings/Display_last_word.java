package Strings;

import java.util.Scanner;

public class Display_last_word {
	public static void check(String str)
	{
		String res="";
		for(int i=str.length()-1;i>0;i--)
		{
			if(str.charAt(i)!=' ')
			{
				res=str.charAt(i)+res;
			}
			else
			{
				break;
			}
		}
		System.out.println("last word:"+res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.nextLine();
		check(str);
		sc.close();
	}
}
