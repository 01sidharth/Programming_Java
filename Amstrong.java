
	import java.util.Scanner;
	public class Amstrong {
		public static void add(int num)
		{
			int res=0;
			int temp=num;
		    int c=String.valueOf(num).length();
			while(num>0){
			  int rem=num%10;
		       res=res+(int)Math.pow(rem,c);
		        num=num/10;
			}
			if(res==temp)
			{
				System.out.println("Amstrong number");
			}
			else
			{
				System.out.println("Not a Amstrong number");
			}
		}
		public static void main(String[] args) {
			
			
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		add(a);
		sc.close();
		
		
	}
	}


