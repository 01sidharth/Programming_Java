import java.util.*;
public class PrintPrimenumber {
	public static void print(int s,int e)
	{
		for(int i=s;i<=e;i++)
		{
		int c=0;
		for(int j=2;j<=i-1;j++)
		{
			if(i%j==0)
			{
				c++;
			}
		}
		if(i>=2 && c==0)
		{
			System.out.print(i+" ");
		}
	}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Starting number:");
		int s=sc.nextInt();
		System.out.println("Enter the ending number:");
		int e=sc.nextInt();
		print(s,e);
		sc.close();
		
	}
}
