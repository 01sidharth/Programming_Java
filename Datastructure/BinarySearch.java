package Datastructure;

import java.util.Arrays;

public class BinarySearch {
 static int bsearch(int[] arr,int key)
 {   
	 int l=0;
	 int h=arr.length-1;
	 while(l<=h)
	 {
		 int m=(l+h)/2;
		 if(arr[m]==key)
		 {
			 return m;
		 }
		 else if(arr[m]<key)
		 {
			 l=m+1;
		 }
		 else
		 {
			 h=m-1;
		 }
	 }
	 return -1;
 }
 public static void main(String[] args) {
	int[] arr= {16,15,13,12,3,7,5};
	Arrays.sort(arr);
	System.out.println(bsearch(arr,1));
	System.out.println(bsearch(arr,7));
	System.out.println(bsearch(arr,5));
	
	//Best time complexity=O(1)
	//worst time complexity=O(log n)
}
}
