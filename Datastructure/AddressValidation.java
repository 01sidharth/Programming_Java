package Datastructure;

import java.util.Arrays;

public class AddressValidation {
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
	public static String check(String str)
	{
		String[] ch=str.split("[.]");
		int[] ch1=new int[ch.length];
		if(ch.length<4)
		{
			return "Invalid";
		}
		else {
			for(int i=0;i<ch.length;i++)
			{
				ch1[i]=convert(ch[i]);
				System.out.println(ch1[i]);
				if(!(ch1[i]>55&&ch1[i]<255))
				{
					return "Invalid";
				}
				
			}
			
			return "Valid";
			
		}
	}
	public static void main(String[] args) {
		String str="128.67.89.254";
		System.out.println(check(str));
	}
}
