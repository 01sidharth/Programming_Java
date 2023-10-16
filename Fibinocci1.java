import java.util.Scanner;

public class Fibinocci1 {
	public static void fib(int n)
	{
		int n1=1;
		int n2=1;
		int n3=0;
		int sum=0;
		int l=0;
		for(int i=1;i<=n;i++)
		{  System.out.print(n1+" ");
			n3=n1+n2;
		    n1=n2;
		    n2=n3;
		    l=n2-n1;
			
			sum=sum+n2-n1;
		}
		System.out.println();
		System.out.println("sum "+sum);
		System.out.println("nth "+l);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Range:");
		int b =sc.nextInt();
		fib(b);
		sc.close();

}
}
