package Array;

import java.awt.datatransfer.StringSelection;

public class DoubleArray {
	public static int[] convert(int[] num) {
		  int[] res=new int[num.length*2];
		 
		  int j=0;
		  for(int i=0;i<num.length;i++)
		  {
		    res[j]=num[i];
		    j++;
		    res[j]=num[i];
		    j++;
		  }
		  
		  for(int i=0;i<res.length;i++)
		  {
			  System.out.print(res[i]+"");
		  }
		  return res;
		  
		}
	public static void main(String[] args) {
		int []num= {1,2,3};
		convert(num);
	}


}
