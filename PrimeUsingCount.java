import java.util.Scanner;

public class PrimeUsingCount {
	public static String prime(int x)// time complexity  O(n/2)
	{
		//                         Prime Number checking using count
		
		
	   int count=0;
	
	   for(int i=2;i<x/2;i++)
		{
			if(x%i==0)
			{
				
				count++;
			}
		}
		if(x!=1 && count==0)
		{
			return "The number is prime";
		}
		else
		{
			return "The number is not prime";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int b =sc.nextInt();
		
		System.out.println(prime(b));
		sc.close();
	}

}