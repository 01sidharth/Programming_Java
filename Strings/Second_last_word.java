package Strings;

import java.util.Scanner;

public class Second_last_word {
	public static void check(String str)
	{
		String res="";
		boolean flag=false;
		for(int i=str.length()-1;i>0;i--)
		{
			if(str.charAt(i)==' ' && flag==false)
			{
					flag=true;
			}
			else if(str.charAt(i)!=' ' && flag==true)
			{
					res=str.charAt(i)+res;
			}
			else if(str.charAt(i)==' ' && flag==true)
			{
					break;
			}
			
		}
		System.out.println("Second last word:"+res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.nextLine();
		check(str);
		sc.close();
	}
}
