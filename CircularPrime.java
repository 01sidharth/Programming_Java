import java.util.Scanner;

public class CircularPrime {
	public static String check(int n)
	{   int t1=n;
		int c=0;
		while(t1>0) {
			c++;
			t1=t1/10;
		}
		for(int i=1;i<=c;i++)
		{
			if(prime(n))
			{
				int last=n%10;
				int first=n/10;
				n=last*(int)Math.pow(10, c-1)+first;
			}
			else
			{
				return "Not a circular Prime";
			}
			
		}return "Circular prime";
	}
	public static boolean prime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		else if(n==2||n==3)
		{
			return true;
		}
		else if(n%2==0||n%3==0)
		{
			return false;
		}
		for(int i=5;i<=(int)Math.sqrt(n);i=i+2)
		{
			if(n%i==0)
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
