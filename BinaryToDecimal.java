import java.util.Scanner;

public class BinaryToDecimal {
	public static void check(int n)
	{	
		int t=n;
		long res=0L;
		int p=0;
		while(n>0)
		{
			int rem=n%10;
			res=res+(int)(Math.pow(2,p)*rem);
			p++;
			n=n/10;
		}
		System.out.println(t+"---------->"+res);
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int b =sc.nextInt();
		check(b);
		sc.close();
	}

}


