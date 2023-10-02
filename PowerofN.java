import java.util.*;
public class PowerofN {
	public static long pow(int b,int p)
	{
		long res=1L;
		for(int i=1;i<=p;i++)
		{
			res=res*b;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int x=sc.nextInt();
		System.out.print("Enter the power:");
		int y=sc.nextInt();
		// long res=(long)(Math.pow(x, y));
		long res=pow(x,y);
		System.out.println(x+"^"+y+" :"+res);
		sc.close();
	}
}
