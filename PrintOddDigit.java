import java.util.Scanner;

public class PrintOddDigit {
	public static void mul(int num)
	{
		while(num>0) {
	       int rem=num%10;
	       if(rem%2!=0)
	       {
	    	   System.out.print(rem+" ");
	    	   }
	        num=num/10;
		}
		
	}
	public static void main(String[] args) {
		
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int a=sc.nextInt();
	mul(a);
	sc.close();

}
}
