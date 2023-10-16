import java.util.Scanner;

public class SpecialNum {
	public static void sep(int n)
	{   int res=0;
		int temp=n;
		while(n>0)
		{  int rem=n%10;
		   int x=(int) check(rem);
		   n=n/10;
		   res=res+x;
			
		}
		if(res==temp)
		{
			System.out.println("special number");
		}
		else
		{
			System.out.println("not a special number");
		}
	}
	public static long check(int x)
	{
		long sum=1L;
		  for(int i=x;i>=1;i--)
		  {
			  sum=sum*i;
			  
		  }
		  return sum;
	}
	public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter the number:");
			int a=sc.nextInt();
			sep(a);
			sc.close();
	}
	

}
