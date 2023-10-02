
public class PrintFactorial {
	public static void fact(int x)
	{ 
		
		
		
		for(int i=1;i<=x;i++)
	   {long sum=1L;
	  for(long j=i;j>=1;j--)
	  {
		  sum=sum*j;
		  
	  }
	  System.out.println(i+"--->"+sum);
	}	}
	public static void main(String[] args) {
		fact(7);
	}

}
