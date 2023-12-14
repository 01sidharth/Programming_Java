package Datastructure;

public class PalindromeInString {
	static boolean pal(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return s.equals(rev);
	}
	public static void main(String[] args) {
		String str="abbajkjxykkkkabac";
		for(int i=0;i<str.length();i++)
		{
			String temp=""+str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				temp=temp+str.charAt(j);
				if(pal(temp)) {
				System.out.println(temp);
				}
			}
		}
	}

}
