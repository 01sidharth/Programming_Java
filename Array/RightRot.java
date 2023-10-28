package Array;

import java.util.Scanner;

public class RightRot {
		public static void rightrot(int[] num,int m)
		{ for(int j=1;j<=m;j++) {
			int last=num[num.length-1];
			for(int i=num.length-1;i>0;i--)
			{  
				if(num[i-1]>=0) 
				{
					num[i]=num[i-1];
				}
			}
			num[0]=last;
			for(int i=0;i<num.length;i++)
			{
				System.out.print(num[i]+" ");
			}System.out.println();
		}
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
		System.out.println("rotation number:");
		int m=sc.nextInt();
		rightrot(num,m);
		sc.close();
	}
	}