package Datastructure;

import java.util.regex.Pattern;

public class Addvalidation {
	static String check(String[] arr )
	{
		if(arr.length<4)
		{
			return "invalid";
		}
		else
		{
			for(int i=0;i<arr.length;i++)
			{   
				if(!(Pattern.matches("[0-9]{55,255}","arr[i]")))
				{
					return "invalid";
				}
			}
		}
		return "valid";
	}
	public static void main(String[] args) {
		String str="128.67.89.255";
		String[] arr=str.split("[.]");
		System.out.println(check(arr));
		
	}
}
