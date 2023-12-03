package Datastructure;

import java.util.Scanner;

public class SumofDiagonal2Darray {
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
	int lsum=0,rsum=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{	
			if(i==j) {
			lsum=lsum+arr[i][j];
			}
		}
	}
	System.out.println("left diagonal Sum:"+lsum);
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{	
			if(i+j==arr.length-1) {
			rsum=rsum+arr[i][j];
			}
		}
	}
	System.out.println("Right diagonal Sum:"+rsum);
}
}
