package Array;

public class ReverseArray {
	public static void reverse(int []num)
	{
		int res[]=new int[num.length];
		int r=num.length;
		for(int i=0;i<num.length;i++)
		{
			res[i]=num[r-1];
			r--;
		}
		System.out.println("Reverse of the Array");
		print(res);
	}
	public static void print(int[] num)
	{   for(int i=0;i<=num.length-1;i++)
	{
		System.out.print(num[i]+" ");
	}
		System.out.println();
	}
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Original Array");
		print(num);
		reverse(num);
	}

}
