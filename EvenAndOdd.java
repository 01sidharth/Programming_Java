import java.util.Scanner;

public class EvenAndOdd {
	public static void mul(int num)
	{
		int c=0,a=0,b=0;
		while(num>0) {
	       int rem=num%10;
	       b++;
	       if(rem%2!=0)
	       {
	    	   c++;
	    	   }
	       else if(rem!=0&&rem%2==0){
	    	  a++;
	       }
	        num=num/10;
		}
		System.out.println("Total number of numbers:"+b);
		System.out.println("Number of Even number:"+a);
		System.out.println("Number of Odd number:"+c);
		
	}
	public static void main(String[] args) {
		
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int a=sc.nextInt();
	mul(a);
	sc.close();

}

}
