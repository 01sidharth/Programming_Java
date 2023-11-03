package Array;
import java.util.Scanner;
public class PasswordCheck {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the password");
		String str=sc.nextLine();
		int m=0,n=0,l=0;
		if(str.length()>4 && !(str.charAt(0)>='0' && str.charAt(0)<='9'))
				{
					for(int i=0;i<str.length();i++)
					{   char ch=str.charAt(i);
						if(ch>='A' && ch<='Z')
						{
							m=1;
						}
						if(ch>='0' && ch<='9')
						{
							n=1;
						}
						if(ch==' ' || ch=='\\')
						{
							l=1;
						}
					}
				}
		if(m==1 &&n==1 && l==0 )
		{
			System.out.println("good");
		}
		else
		{
			System.out.println("bad");
		}
	}

}
