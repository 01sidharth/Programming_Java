package Datastructure;

public class Sumofnumber_Recursion {
//	static int sum=0;
//	public static int sums(int n)
//	{
//		if(n>=1)
//		{
//			sum=sum+n;
//			sums(n-1);	
//		}
//		return sum;
//	}
	
	public static int sums(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			return n+sums(n-1);	
		}
	}
	public static void main(String[] args) {
		System.out.println(sums(5));
	}
}
