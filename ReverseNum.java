import java.util.Scanner;

public class ReverseNum {
		public static void check(int num)
		{
			int res=0;
			int temp=num;
			while(num>0){
			  int rem=num%10;
		       res=res*10+rem;
		        num=num/10;
			}
			if(res==temp)
			{
				System.out.println("Palindrome number");
			}
			else
			{
				System.out.println("Not a palindrome number");
			}
		}
		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("No of checks:");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{System.out.println("Enter the number:");
			int a=sc.nextInt();
			check(a);		
			}
			sc.close();

		}

}
