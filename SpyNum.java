import java.util.Scanner;

public class SpyNum {
	public static void add(int num)
	{
		int res=0;
		int res1=1;
		while(num>0){
		  int rem=num%10;
	       res=res+rem;
	       res1=res1*rem;
	       
	        num=num/10;
		}
		if(res==res1)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not a Spy number");
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
