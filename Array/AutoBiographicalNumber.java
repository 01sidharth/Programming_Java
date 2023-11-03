package Array;

import java.util.HashSet;

public class AutoBiographicalNumber {
	public static int check(int n)
	{
		String s=Integer.toString(n);
		HashSet<Integer> set=new HashSet<>();
		int c=0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++)
			{
				if(Character.getNumericValue(s.charAt(j))==i) {
					c++;
				}
			}
			if(!(Character.getNumericValue(s.charAt(i))==c))
			{
				return 0;
			}
			c =0;
			set.add(Character.getNumericValue(s.charAt(i)));
			
			
		}
		return set.size();
	}
	public static void main(String[] args) {
		System.out.println(check(123));
	}

}
