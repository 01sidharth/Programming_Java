package Datastructure;

import java.util.Arrays;

public class AttainTarget {
	public static void main(String[] args) {
		int a[]= {5,1,2,7,3,8,5,5,9,12,4};
		int target=10;
		Arrays.sort(a);
		int l=0;
		int h=a.length-1;
		while(l<h) {
			if(a[l]+a[h]==target)
			{
				System.out.println(a[l]+","+a[h]);
				l++;
				h--;
			}
			else if(a[l]+a[h]>target)
			{
				h--;
			}
			else
			{
				l++;
			}
		}
	}

}
