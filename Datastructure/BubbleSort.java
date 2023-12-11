package Datastructure;

import Array.PrintArray;

public class BubbleSort {
	static void sort(int[] num) {
		
			for(int i=0;i<num.length;i++)
			{	
				for(int j=0;j<num.length-1-i;j++)
				{	
					if(num[j]>num[j+1])
					{
						int temp=num[j];
					       num[j]=num[j+1];
					       num[j+1]=temp;
						
					}				
				}
				
			}
	}
	public static void main(String[] args) {
		int[] arr= {3,4,6,1,2,5};
		sort(arr);
		for(int ele:arr)
		{
			System.out.print(ele+" ");
		}
		
	}

}
