package Array;
import java.util.*;
public class MergeTwoArray {
	public static void merge(int[] num1,int[] num2) {
		int[] res=new int[num1.length+num2.length];
		int i=0;
		for(i=0;i<num1.length;i++)
		{
			res[i]=num1[i];
		}
		for(int j=0;j<num2.length;j++)
		{
			res[i]=num2[j];
			i++;
		}
		System.out.println(Arrays.toString(res));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array1:");
		int n=sc.nextInt();
		int[] num=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Enter the Size of the Array2:");
		int l=sc.nextInt();
		int[] num2=new int[l];
		System.out.println("Enter the Elements");
		for(int i=0;i<l;i++)
		{
			num2[i]=sc.nextInt();
		}
		
		merge(num,num2);
		sc.close();
	}

}
