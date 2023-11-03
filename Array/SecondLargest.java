package Array;

public class SecondLargest {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9};
		int first=arr[0];
		int second=arr[1];
		if(arr[0]>arr[1])
		{
			first=arr[0];
			second=arr[1];
		}
		else
		{
			{
				first=arr[1];
				second=arr[0];
			}
		}
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				int temp=first;
				second=temp;
				first=arr[i];
			}
			else
			{
				second=arr[i];
			}
		}
		System.out.println(second);
	}

}
