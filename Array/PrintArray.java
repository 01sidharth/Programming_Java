package Array;

import java.util.Arrays;

public class PrintArray {
	public static void take(int[] a,int[] b,int[] c)
	{
		print(a);
		print(b);
		print(c);
	//	System.out.println(Arrays.toString(a));
	//	System.out.println(Arrays.toString(b));
	//	System.out.println(Arrays.toString(c));
	}
//	public static int[] print(int[] num)
	public static void print(int[] num)
	{   for(int i=0;i<=num.length-1;i++)
	{
		System.out.print(num[i]+" ");
	}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {6,2,3,4,5};
		int[] c= {4,5};
		take(a,b,c);
	}

}
