package Datastructure;

public class Demorecursion {
	//5 4 3 2 1
	public static void display(int n)
	{
		if(n>=1)
		{
			System.out.println(n);
			display(n-1);
		}
	}
	public static void main(String[] args) {
		display(5);
	}

}
