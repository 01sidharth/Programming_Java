package Datastructure;
import java.util.regex.*;
public class RegularExpression {
	public static void main(String[] args) {
//		Pattern p=Pattern.compile("regex");
//		Matcher n=p.matcher("str");
//		boolean ans=n.matches();
//		System.out.println(ans);
//		System.out.println("=============================");
//		System.out.println(Pattern.matches("regex", "str"));
		
		
		//string starting withh A
//		String s="Apple";
//		Pattern p=Pattern.compile("A.*");
//		Matcher n=p.matcher(s);
//		boolean ans=n.matches();
//		System.out.println(ans);
		
		//Ending with Z
//		String s="appleZ";
//		System.out.println(Pattern.matches(".*Z", s));
		
		//Starting with A or a
//		String s="apple";
//		System.out.println(Pattern.matches("[a,A].*", s));
		
		//Ending with A or a
//		String s="appleZ";
//		System.out.println(Pattern.matches(".*[Z,z]", s));
		
		//any where abc
//				String s="appleZabcApple";
//				System.out.println(Pattern.matches(".*abc.*", s));
		
		
//		//RE only alphabets
//		String s="appleZabcApple";
//		System.out.println(Pattern.matches("[A-Z,a-z]*", s));
		
		//RE only alphabets and numerics
//				String s="appleZab34cApple12";
//				System.out.println(Pattern.matches("[A-Z,a-z,0-9]*", s));
		
		
		//RE contains only special charachters
//		String s="$@";
//		System.out.println(Pattern.matches("[^A-Z,^a-z,^0-9]*", s));
		
		//RE length of 5 and contains only alphabets
//		String s="abcde";
//		System.out.println(Pattern.matches("[A-Z,a-z]{5}", s));
		
		//RE 4 as alpha next 3 charachter as numeric(total only 7)
//		String s="abcd123";
//		System.out.println(Pattern.matches("[A-Z,a-z]{4}[0-9]{3}", s));
		
//		//RE 4 as alpha next 3 charachter as numeric
//				String s="abcd123";
//				System.out.println(Pattern.matches("[a-z]{3,5}[0-9]{2,4}", s));
		
		//RE stast with 6 or 7 or 9
//		String s="6999999999";
//		System.out.println(Pattern.matches("[6,7,9]{1}[0-9]{9}", s));
		
		//re 4-6 alpha the # it may be empty or n numbers 3-4 numerics @gmail.com
		String s="abcd#123@gmail.com";
		System.out.println(Pattern.matches("[a-z,A-Z]{4,6}#*[0-9]{3,4}@gmail[.]com", s));
		
	}
}
