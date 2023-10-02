import java.util.Scanner;

public class Factor {
	//                                       Factors of a Number
	public static void fact(int x)
	{int sum=0;
	int count=0;
	    for(int i=1;i<=x;i++)    //without excluding
	   //for(int i=1;i<x;i++)     //excluding the number
	   //for(int i=2;i<x;i++)//   //excluding 1 & the number
		{
			if(x%i==0)
			{
				System.out.print(i+" ");
				sum=sum+i;
				count++;
			}
		}
		System.out.println();
		System.out.println("Sum of Factors:"+sum);
		System.out.println("count: "+count);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int b =sc.nextInt();
		fact(b);
		sc.close();
	}

}
