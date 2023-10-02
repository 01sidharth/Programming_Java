import java.util.Scanner;

public class SumofDigit {
	public static int add(int num)
	{
		int res=0;
		while(num>0) {
	       int rem=num%10;
	        res=res+rem;
	        num=num/10;
		}
		return res;
	}
	public static void main(String[] args) {
		
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int a=sc.nextInt();
	
	System.out.println("Answer:"+add(a));
	sc.close();

}
}
