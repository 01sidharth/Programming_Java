package Datastructure;

import java.util.LinkedHashSet;

public class Panagram {
	static String check(String s)
	{
		String s1=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
//		char [] ch=s1.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]>=97 &&ch[i]<=122)
//			{
//				set.add(ch[i]);
//			}
//		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' & s1.charAt(i)<='z')
			{
				set.add(s1.charAt(i));
			}
		}
		if(set.size()==26)
		{
			return "Panagram";
		}
		else
		{
			return "not panagram";
		}
	
		
	}
		public static void main(String[] args) {
			String s="abcdefgjtgfauydgufiuhijklmn4513476971659opqrsAWQEEWRTYYUUtuvw36596539746xyz";
			
			System.out.println(check(s));
		}

}
