
public class FibNtheven {
	public static void check(int n)
	{
		int n1=1;
		int n2=1;
		int n3=0;
		int c=0;
		int l=0;
		while(n>c)
		{   
			n3=n1+n2;
			n1=n2;
			n2=n3;
			if(n1%2==0)
			{ System.out.print(n1+" ");
				l=n1;
				c++;
			}
		}
		System.out.println();
		System.out.println(l);
	}
	public static void main(String[] args) {
		check(5);
	}

}
