package Datastructure;

public class OccurKfirst {
	public static int check(int[] arr,int N,int k)
	{
		int max=arr[0];
		for(int ele:arr)
		{
			if(max<ele)
			{
				max=ele;
			}
		}
		int[] temp=new int[max+1];
		for(int ele:arr)
		{
			temp[ele]++;
			if(temp[ele]==k)
			{
				return ele;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,7,4,3,4,8,7};
		int N=7;
		int k=2;
		System.out.println(check(arr,N,k));
	}

}
