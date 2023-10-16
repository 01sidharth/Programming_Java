import java.util.Scanner;

public class ReverseAB {
	public static long merge(int n1,int n2)
	{
		int t1=n2;
		int c=0;
		long res=0L;
		while(t1>0)
		{
			c++;
			t1=t1/10;
		}
		res=n1*pow(10,c)+n2;
		return res;
	}
	public static long pow(int b,int p)
	{
	long res=1l;
	for(int i=0;i<p;i++)
	{
		res=res*b;
	}
	return res;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("A:");
		int a=sc.nextInt();
		System.out.println("B:");
		int b=sc.nextInt();
		System.out.println(merge(a,b));
		sc.close();
	}

}
