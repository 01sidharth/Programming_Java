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
		
		
		//RE only alphabets
		String s="appleZabcApple";
		System.out.println(Pattern.matches("[A-Z,a-z]*", s));
		
	}
}
