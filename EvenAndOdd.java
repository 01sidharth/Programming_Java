import java.util.Scanner;

public class EvenAndOdd {
	public static void mul(int num)
	{
		int c=0,a=0;
		while(num>0) {
	       int rem=num%10;
	       if(rem%2!=0)
	       {
	    	   c++;
	    	   }
	       else {
	    	  a++;
	       }
	        num=num/10;
		}
		System.out.println("Number of Even number:"+a);
		System.out.println("Number of Even number:"+c);
		
	}
	public static void main(String[] args) {
		
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int a=sc.nextInt();
	mul(a);
	
	sc.close();

}

}
