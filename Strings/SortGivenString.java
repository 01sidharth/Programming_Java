package Strings;

import java.util.Scanner;

public class SortGivenString {
	public static void tochar(String str)
	{
		char[] res=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			res[i]=str.charAt(i);
		}
		sort(res);
	}
	public static void sort(char[] str)
	{
		
		for(int i=0;i<str.length;i++)
		{	
			boolean b=false;
			for(int j=0;j<str.length-1;j++)
			{
				if(str[j]>str[j+1])
				{	b=true;
					char temp=str[j];
				       str[j]=str[j+1];
				       str[j+1]=temp;
					
				}				
			}
			if(b==false)
			{
				break;
			}
		}
		chartoString(str);
	}
	public static void chartoString(char[] str)
	{
		String res="";
		for(int i=0;i<str.length;i++)
		{
			res=res+str[i];
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		tochar(str);
		sc.close();
	}
}
