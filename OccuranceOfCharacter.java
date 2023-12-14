package Datastructure;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class OccuranceOfCharacter {
	public static void check(String str)
	{
		char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		LinkedHashMap<Character,Integer> l1=new LinkedHashMap<>();
		for(char ele:ch)
		{
			if(l1.containsKey(ele))
			{
				l1.put(ele,l1.get(ele)+1);
			}
			else
			{
				l1.put(ele,1);
			}
		}
		System.out.println(l1);
		for(Object ele:l1.keySet())
		{
			System.out.println(ele+"-"+l1.get(ele));
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		check(str);
		
	}

}


