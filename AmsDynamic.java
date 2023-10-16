import java.util.Scanner;

public class AmsDynamic {
	public static void add(int num)
	{
		int res=0;
		int temp=num,temp1=num;
		int c=0;
		while(num>0){
			  c++;
		      num=num/10;
			}
	    
		while(temp1>0){
		  int rem=temp1%10;
	      res=res+(int)Math.pow(rem,c);
	      temp1=temp1/10;
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
