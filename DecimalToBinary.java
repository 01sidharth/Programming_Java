import java.util.Scanner;
//                                           !!!!!!!!!!!!!!!!!!Important Question!!!!!!!!!!!!!!!!!!!!!!!!!
public class DecimalToBinary {
	public static void check(int start,int end)
	{	for(int i=start;i<=end;i++) {
		int n=i;
		long res=0L;
		int p=0;
		while(n>0)
		{
			int rem=n%2;
			res=rem*(long)Math.pow(10,p)+res;
			p++;
			n=n/2;
		}
		System.out.println(i+"---------->"+res);
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Start Number:");
		int b =sc.nextInt();
		System.out.println("Enter the End Number:");
		int c =sc.nextInt();
		check(b,c);
		sc.close();
	}

}
