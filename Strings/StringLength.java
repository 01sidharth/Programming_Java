package Strings;

import java.util.Scanner;

public class StringLength {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String a=sc.nextLine();
	int c=0;
	for(int i=0;;i++)
	{
		try {
			a.charAt(i);
			c++;
		}
		catch(Exception e)
		{
			break;
		}
	}
	System.out.println(c);
	sc.close();
}
}
