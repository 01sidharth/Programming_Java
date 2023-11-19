package Strings;

import java.util.Scanner;

public class A3b4cd2z_program {
	public static String convert(char c,int n)
	{   String res="";
		for(int i=0;i<n;i++)
		{
			res=res+c;
		}
		return res;
	}
	public static String check(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{   
			if(i+1!=str.length() && (str.charAt(i+1)>=48 && str.charAt(i+1)<=57))
			{  
				int n=str.charAt(i+1)-48;
				res=res+convert(str.charAt(i),n);
				i=i+1;
			}
			else
			{
				res=res+str.charAt(i);
			}
			
		}
		return res;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  string");
	String str=sc.nextLine();
	System.out.println("Result String:->"+check(str));
	sc.close();
}
}
