package Strings;

import java.util.Scanner;
													// String to Integer//
public class Parsing {
public static int convert(String str)
{ 
	int res=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>=48 && str.charAt(i)<=57) {
		res=res*10+(str.charAt(i)-48);}
	}
	if(str.charAt(0)=='-')
	{
		res=res*-1;
		return res;
	}
	else 
	{
	return res;
	}
} 
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String to number:");
	String str=sc.nextLine();
	System.out.println(convert(str));
	sc.close();
}
}
