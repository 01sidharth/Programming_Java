package Datastructure;

public class Factorial_of_n_recursion {
	static int fact=1;
	public static int facts(int n)
	{
		if(n>=1)
		{
			fact=fact*n;
			facts(n-1);	
		}
		return fact;
	}
	public static void main(String[] args) {
		System.out.println(facts(6));
	}
}
