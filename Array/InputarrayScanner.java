package Array;

import java.util.Scanner;

public class InputarrayScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int n=sc.nextInt();
		int [] num=new int[n];
		System.out.println("Enter the Array element:");
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<=num.length-1;i++)
		{   
			System.out.print(num[i]+" ");
			
		}
		sc.close();
	}

}
