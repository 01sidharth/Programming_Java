package Array;

public class EvenArray {
	public static void Even(int[] num)
	{   int sum=0;
		for(int i=0;i<=num.length-1;i++)
	{   if(num[i]%2==0) {
		System.out.print(num[i]+" ");
		sum=sum+num[i];
	}
	
	}
		System.out.println();
		System.out.println("Sum of the Even Element:"+sum);
	}
	public static void main(String[] args) {
		int [] num= {1,2,3,4,5,6,7,8,9};
		Even(num);
	}

}
