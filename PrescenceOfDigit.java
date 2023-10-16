import java.util.Scanner;

public class PrescenceOfDigit {
	public static int check(int range,int n) {
		int c=0;
		for(int i=1;i<=range;i++)
		{
			if((i%10==n)&&(i/10==n))
			{
				c=c+2;
			}
			else if(i%10==n||i/10==n)
			{
				c=c+1;
			}
			
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range:");
		int range=sc.nextInt();
		System.out.println("Enter the key:");
		int key=sc.nextInt();
		System.out.println("Presence of Digit:"+check(range,key));
		sc.close();
	}

}
