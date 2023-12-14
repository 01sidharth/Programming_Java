package Datastructure;

public class Fib_recursion {
	static int n1=0,n2=1,n3=0;    
	public static void fib(int n)
	{
		 if(n>0){  
			 System.out.print(n1+" "); 
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;       
	         fib(n-1);    
	     }   
	}
	public static void main(String[] args) {
		fib(10);
	}
}
