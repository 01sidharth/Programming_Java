package Datastructure;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class OccuranceOfWord {
	public static void check(String str)
	{
		String[] ch=str.split(" ");
		LinkedHashMap<String,Integer> l1=new LinkedHashMap<>();
		for(String ele:ch)
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
		for(String ele:l1.keySet())
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
// hello hi bye hi welcome hello hi
// o/p ->hello-2
//		hi-3
//		bye-1
//		welcome-1
