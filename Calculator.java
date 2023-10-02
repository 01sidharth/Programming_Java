import java.util.Scanner;
public class Calculator {
		public static int add(int a,int b)
		{
			int sum = a+b;
			return sum;
		}
		public static int sub(int a,int b)
		{
			int sub = a-b;
			return sub;
		}
		public static int mul(int a,int b)
		{
			int mul = a*b;
			return mul;
		}
		public static int div(int a,int b)
		{
			int div = a/b;
			return div;
		}
		public static void main(String[] args)
		{ int s=0;
		   Scanner sc = new Scanner(System.in);
		   do {
		   System.out.print("Enter first number a- ");
		   int a= sc.nextInt();
		   System.out.println("Enter the second number b-");
		   int b=sc.nextInt();
			System.out.println(add(a,b));
			System.out.println("you want to continue:");
			s=sc.nextInt();
			}while(s==1);
		}

	}


