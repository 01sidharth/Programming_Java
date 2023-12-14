package Datastructure;

public class StringPattern {
	public static void main(String[] args) {
		String s="jspiders";
		System.out.println(s);
		int l=0,h=s.length()-1;
		for(int i=0;i<s.length();i++)
		{
			String temp="";
			if(i%2==0)
			{
				l++;
			}
			else
			{
				h--;
			}
			for(int j=l;j<=h;j++)
			{
				temp=temp+s.charAt(j);
			}
			System.out.println(temp);
		}
	}// when 
}
