import java.util.Scanner;
class Palindrome{
public static void check(String str){
	StringBuilder s = new StringBuilder(str).reverse();
	System.out.println(s);
	if(str.contentEquals(s))
	{
			System.out.println("Given string is palindrome");
	}
	else
	{
	System.out.println("Given string is not palindrome");
	}

}



	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:");
	String str=sc.nextLine();
	check(str);
	sc.close();
	}
}

