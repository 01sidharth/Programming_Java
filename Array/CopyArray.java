package Array;

import java.util.Arrays;

public class CopyArray {
	public static int[] copy(int[] num)
	{
		int [] res=new int[num.length];
		System.out.println("Array before copying");
		print(res);
		for(int i=0;i<=num.length-1;i++)
		{
			res[i]=num[i];
		}
		System.out.println("Array after copying");
		print(res);
		System.out.println(Arrays.toString(res));//printing with toString method
		return res;
	}
	public static void print(int[] num)
	{   for(int i=0;i<=num.length-1;i++)
	{
		System.out.print(num[i]+" ");
	}
		System.out.println();
	}
	public static void main(String[] args) {
		int [] num= {1,3,5,7,9};
		System.out.println("Num Array");
		print(num);
		copy(num);
	}

}
