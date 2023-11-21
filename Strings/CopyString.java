package Strings;

public class CopyString {
	public static void main(String[] args) {
		String copy="abcd";
		String rem="";
		for(int i=0;i<copy.length();i++)
		{
//			rem=rem+copy.charAt(i);//forward
			rem=copy.charAt(i)+rem;//backward
		}
		System.out.println(rem);
	}

}
