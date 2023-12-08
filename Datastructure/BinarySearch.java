package Datastructure;

public class BinarySearch {
 static int search(int[] arr,int key)
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
	int[] arr= {1,2,3,4,5,6,7,8,9};
	System.out.println(search(arr,7));
	System.out.println(search(arr,5));
	System.out.println(search(arr,1));
	//Best time complexity=O(1)
	//worst time complexity=O(log n)
}
}
