package Array;

import java.util.Scanner;

public class PrintDupli {
	public static void print(int[] num)
	{    int pair=0;
		//System.out.println("duplicates:");
		for(int i=0;i<num.length;i++)
		{
			int c=1;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					c++;
					num[j]=-1;
				}		
			}
	//		if(num[i]!=-1 && c>1)//               print duplicate
			if(num[i]!=-1 && c==1)//              print unique
	//		if(num[i]!=-1)//                      print frequency(3)
		//	if(num[i]!=-1)                        remove duplicates,count pair
			{
				System.out.print(num[i]+ " ");
				//System.out.println(num[i]+ "---->"+c); //print frequency(3)
				pair=pair+c/2;//
			}
			
		}
		System.out.println(pair);
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
			print(num);
			sc.close();
		}

	}
