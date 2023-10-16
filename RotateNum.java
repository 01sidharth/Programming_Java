import java.util.Scanner;

public class RotateNum {
	public static void right(int num,int n)
	{  for(int i=1;i<=n;i++) { 
		int t=num;
		int c=0;
		while(t>0)
		{
			c++;
			t=t/10;
		}
		int n1=num%10;
		int n2=num/10;
		System.out.println(n1*pow(10,c-1)+n2);
	}
	
	}
	public static int pow(int b,int p)
	{
	int res=1;
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
		System.out.println("number of times:");
		int b=sc.nextInt();
		right(a,b);
		sc.close();
	}

}
