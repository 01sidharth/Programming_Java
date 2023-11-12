package Strings;

public class DoubleString {
	public static String doubleChar(String str,int n) {
		  String res="";
		  for(int i=0;i<str.length();i++)
		  {
		    res=res+add(str.charAt(i),n);
		  }
		  return res;
		  
		}
	public static String add(char a,int n)
	{
		String res="";
		for(int i=0;i<n;i++)
		{
			res=res+a;
		}
		return res;
	}
	public static void main(String[] args) {
		String str="abc";
		int n=4;
		System.out.println(doubleChar(str,n));
	}

}
