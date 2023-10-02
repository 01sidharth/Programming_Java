import java.util.Scanner;

public class SqrtPrime {
	public static boolean check(int num)
	{
		if(num<=1)
		{
			return false;
		}
		else if(num==2)
		{
			return true;
		}
		else if(num%2==0)
		{
			return false;
		}
		for(int i=3;i<=Math.sqrt(num);i=i+2)
		{
		   if(num%i==0)
		   {
			   return false;
		   }
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int b =sc.nextInt();
		
		System.out.println(check(b));
		sc.close();
	}

}
