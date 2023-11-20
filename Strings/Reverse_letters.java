package Strings;

import java.util.Scanner;

public class Reverse_letters {
	public static void check(String str)
	{
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			   if(str.charAt(i)!=' ') {
				System.out.print(res+str.charAt(i));}
			   else if(str.charAt(i)==' ')
			   {
				   System.out.print(str.charAt(i)+res); 
			   }
			
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.nextLine();
		check(str);
		sc.close();
	}
}
