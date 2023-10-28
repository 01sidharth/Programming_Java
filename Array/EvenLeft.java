package Array;

import java.util.Scanner;

public class EvenLeft {
	public static void check(int[] num) {
		int[] res=new int[num.length];
		int j=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0)
			{
				res[j]=num[i];
				j++;
			}
		}
		for(int i=0;i<num.length;i++) {
			if(num[i]%2!=0)
			{
				res[j]=num[i];
				j++;
			}
		}
		PrintArray.print(res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int n=sc.nextInt();
		int[] num=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		check(num);
		sc.close();
	}

}
