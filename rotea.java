
	import java.util.Scanner;

public class rotea {
	
		public static void check(int n)
		{
			int t1=n;
			int c=0;
			int m=0;
			while(t1>0)
			{	c++;
				t1=t1/10;
			}
			for(int i=1;i<=c;i++)
			{
				
					
				int last=n%10;
				int first=n/10;
				n=last*(int)Math.pow(10,c-1)+first;
				System.out.println(n);
				
			}
		}
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Number:");
			int b =sc.nextInt();
			check(b);
			sc.close();
			
		}

	}


