import java.util.Scanner;
public class Factorial {
	//                                  "Factorial of a Number"
	//----------------------------------------------------------------------------------------------
	
	public long fact(int x)
	{  
	  long sum=1L;
	  for(int i=x;i>=1;i--)
	  {
		  sum=sum*i;
		  if(i>1) {
		  System.out.print(i+"*");}
		  else {
			  System.out.print("1:");
		  }
		  
	  }
	  return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Factorial f=new Factorial();
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		long m=f.fact(n);
		System.out.println();
		System.out.println("The Factorial of "+n+" is :"+m);
		sc.close();
		
	}

}
