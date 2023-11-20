package Strings;

import java.util.Scanner;

public class Display_second_last_length {
	public static void check(String str)
	{
		int c=0;
		boolean flag=false;
		for(int i=str.length()-1;i>0;i--)
		{
			if(str.charAt(i)==' ' && flag==false)
			{
					flag=true;
			}
			else if(str.charAt(i)!=' ' && flag==true)
			{
					c++;
			}
			else if(str.charAt(i)==' ' && flag==true)
			{
					break;
			}
			
		}
		System.out.println("length of second last word:"+c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.nextLine();
		check(str);
		sc.close();
	}
}
