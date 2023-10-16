import java.util.Scanner;

public class CirPrime {
	public static void check(int n)
	{
		int t1=n;
		int c=0;
		int m=0;
		while(t1>0)
		{	c++;
			t1=t1/10;
		}
		for(int i=1;i<=c;i++)
		{
			if(prime(n)) {
				System.out.println(n+" is a prime number");
			int last=n%10;
			int first=n/10;
			n=last*(int)Math.pow(10,c-1)+first;
			m++;
			}
			else
			{
				System.out.println(n+" is not prime number");
				int last=n%10;
				int first=n/10;
				n=last*(int)Math.pow(10,c-1)+first;
			}
		}
		if(m==c)
		{
			System.out.println("Circular prime");
		}
		else
		{
			System.out.println("Not a circular prime");
		}
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
		check(b);
		sc.close();
		
	}

}
