package Datastructure;

import java.util.Scanner;

public class ColMax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr= new int[n][m];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("====================================");
		int temp=arr[0][0];
		int l=0;
		for(int i=0;i<arr.length;i++)
		{	int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{	
				sum=sum+arr[j][i];
			}
			System.out.println(sum);
			if(sum>temp)
			{
				temp=sum;
				l=i;
			}
		}
		System.out.println("col with max sum:"+l);
		
	}

}
