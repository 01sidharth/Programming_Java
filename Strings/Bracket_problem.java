package Strings;
import java.util.*;

public class Bracket_problem {
	public static String check(String str)
	{
		Stack<Character> s=new Stack<Character>();
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[')
			{
				s.push(str.charAt(i));
			}
			else if(!s.isEmpty()&&(s.peek()=='{'&& str.charAt(i)=='}'||
					s.peek()=='('&& str.charAt(i)==')'||
					s.peek()=='['&& str.charAt(i)==']'))
			{
				s.pop();
			}
			else
			{
				s.push(str.charAt(i));
			}
		}
		if(s.isEmpty())
		{
			return "balanced";
		}
		else
		{
			return "unbalanced";
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		System.out.println(check(str));
		sc.close();
		
		
		
	}

}
