import java.util.Scanner;

public class Prime {

		public static void prime(int n)
		{
			int flag=0;
			if(n==1)
			{
				System.out.println("not a prime number");
			}
			else
			{
				for(int i=2;i<n/2;i++)
				{
					if(n%i==0)
					{
						flag=1;
					}
				}
				if(flag==1)
				{
					System.out.println("The number is not prime");
				}
				else
				{
					System.out.println("The number is prime");
				}
			}
		}
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Number:");
			int b =sc.nextInt();
			prime(b);
			sc.close();
		}
}
