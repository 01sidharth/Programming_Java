package Datastructure;

public class Demo2recursion {
	//1 2 3 4 5
		public static void display(int n)
		{
			if(n>=1)
			{
				display(n-1);
				System.out.println(n);
				
			}
		}
		public static void main(String[] args) {
			display(5);
		}
}
