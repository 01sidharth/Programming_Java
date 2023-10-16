import java.util.Scanner;

public class Fibinocci {
//                              0 1 1 2 3 5 8 13 21 34 55 89 
	public static void print(int n) {
	{  /* if(n==1)
	{
		System.out.println("0");
		System.out.println("sum=0");
		return;
		
	}*/
		int n1=0;
		int n2=1;
		int sum=0;
		int n3 = 0;
		System.out.println("The fibinocci series:");
		
		
		//                                logic 1
		
    /*    System.out.print(n1+" ");
		System.out.print(n2+" ");
		for(int i=1;i<=n-2;i++)
		{   n3=n1+n2;
		     n1=n2;
		     n2=n3;
			System.out.print(n3+ " ");
			sum=sum+n3;
		}
		sum=sum+1;
		System.out.println();
		System.out.println("Sum="+sum);
}}*/
		
		
		
		//                 logic 2
		
		
	for(int i=1;i<=n;i++)
		{  
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
			sum=sum+n2-n1;
		}
		
		System.out.println();
		System.out.println("Sum="+sum);
		int l=n2-n1;
		System.out.println("nth number:"+l);
	}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Range:");
		int b =sc.nextInt();
		print(b);
		sc.close();

	}

}