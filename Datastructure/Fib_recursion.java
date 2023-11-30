package Datastructure;

public class Fib_recursion {
	static int n1=0,n2=1,n3=0;    
	public static void display(int n)
	{
		 if(n>0){  
			 System.out.print(n1+" "); 
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	           
	         display(n-1);    
	     }   
	}
	public static void main(String[] args) {
		display(10);
	}
}
