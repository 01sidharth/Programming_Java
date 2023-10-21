package Array;

public class ArraySum {
 public static void sum(int[] num )
 {
	 int sum=0;
	 for(int i=0;i<num.length;i++)
	 {
		 sum=sum+num[i];
	 }
	 System.out.println("Sum of Array:"+sum);
	 
 }
 public static void main(String[] args) {
	int [] num= {1,2,3,4,5,6,7,8,9};
	sum(num);
}
}
