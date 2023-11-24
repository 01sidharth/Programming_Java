package Strings;

public class HeTlo {
	public static String convert(String str,int i,char ch)
	{   if(i>str.length()-1)
		{
			return "not possible";
		}
		else {
			str=str.substring(0,i)+ch+str.substring(i+1);
			return str;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(convert("hello",5,'T'));
	}
}
