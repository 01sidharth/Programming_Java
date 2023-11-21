package Strings;

import java.util.Scanner;
                        //Strong password:1aBc@234567   starting with numeric ,length=>8,1 special symbol ,more than 1 Uppercase
public class PasswordCheck {
	public static String check(String str)
	{   int up=0;
	    int spcl=0;
		if(str.length()<8) {
			return "weak Password";
		}
		if(!(str.charAt(0)>=48 && str.charAt(0)<=57))
		{
			return "weak Password";
		}
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				up++;
			}
			if(!(str.charAt(i)>=65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122 || str.charAt(i)>=48 && str.charAt(i)<=57 ))
			{
				spcl++;
			}
			   
		}
		if(up>=1 && spcl==1)
		{
			return "Strong password";
		}
		else {
			return "weak Password";
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password:");
		String str=sc.nextLine();
		System.out.println(check(str));
		sc.close();
	}

}
