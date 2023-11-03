package Array;

public class PerfectSquar {
	public static void check(int[] n)
	{
		for(int i=0;i<n.length;i++)
		{
			int sqrt=(int)Math.sqrt(n[i]);
			if(n[i]==sqrt*sqrt)
			{
				System.out.println(n[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int n[]= {64,16,38,81,50,100};
		check(n);
	}

}
