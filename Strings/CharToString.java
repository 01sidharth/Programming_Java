package Strings;

import java.util.Scanner;

public class CharToString {
	public static void print(char[] str)
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
		char[] str= {'s','i','d','h','a','r','t','h'};
		print(str);
		sc.close();
	}

}
