import java.util.Scanner;

public class Triangle {
	// 1 3 6 10 15 21 28 36 45 55(Triangle number)
	
	
	public static void print(int n)
	{
		int x=1;
		int d=2;
		System.out.println("The Triangle series:");
		for(int i=1;i<=n;i++)
		{
			System.out.print(x+ " ");
			x=x+d;
			d++;
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Range:");
		int b =sc.nextInt();
		print(b);
		sc.close();

	}

}



