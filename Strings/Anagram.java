package Strings;

import java.util.Scanner;

public class Anagram {
	public static String check(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return "not anagram";
		}
		s1=tolowercase(s1);
		s2=tolowercase(s2);
		char c1[]=tochararray(s1);
		char c2[]=tochararray(s2);
		sort(c1);
		sort(c2);
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				return "not anagram";
			}
		}
		return "Anagram string";
		
	}
	public static String tolowercase(String s)
	{
		String res="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				res=res+(char)(s.charAt(i)+32);
			}
			else
			{
				res=res+s.charAt(i);
			}
		}
		return res;
	}
	public static char[] tochararray(String s)
	{
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		return ch;
	}
	public static char[] sort(char []ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{   if(ch[i]>ch[j]) 
				{
				ch[i]=(char)(ch[i]^ch[j]);
				ch[j]=(char)(ch[i]^ch[j]);
				ch[i]=(char)(ch[i]^ch[j]);
				}
			}
		}
		return ch;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("enter the first string");
    	String s1=sc.nextLine();
    	System.out.println("enter the second string");
    	String s2=sc.nextLine();
    	System.out.println(check(s1,s2));
    	sc.close();
		
	}

}
