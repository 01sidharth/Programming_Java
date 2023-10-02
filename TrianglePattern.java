
public class TrianglePattern {
	/*
	 *
	 **
	 ***
	 ****
	public static void print(int n)
	{  int i=1,j=1,l=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
				l++;
			}
			System.out.println();
		}*/
	
/*	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	
	public static void print(int n)
	{  int i=1,j=1,l=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				l++;
			}
			System.out.println();
		}*/
	
	/*	
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5  */
	
/*	public static void print(int n)
	{  int i=1,j=1,l=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
				l++;
			}
			System.out.println();
		}
*/
	
/*	1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15 
	
	public static void print(int n)
	{  int i=1,j=1,l=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
		}*/
/*	* * * * * 
	* * * * 
	* * * 
	* * 
	* 	public static void print(int n)
		{  int i=1,j=0,l=1;
			for(i=n;i>0;i--)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			*/
/*	1 
	A 
	2 3 
	B C 
	4 5 6 
	D E F 
	7 8 9 10 
	G H I  J */
	
/*	public static void print(int n)
	{  int i=1,j=1,l=1;
	char x = 'A';
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
			for(j=1;j<=i;j++)
			{
			System.out.print((x)+" ");
			x++;}
			System.out.println();
		}
/*

*    
*    
*    
* * * * 	
 public static void print(int row,int col)
 
	{  int i=1,j=0,l=1;
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=col;j++)
			{   if(i==row||j==1)
				System.out.print("* ");
			else
			{
				System.out.print(" ");
			}
			}
			System.out.println();
		}*/
	
/*	* * * * 
	   * 
	   * 
	   *
	public static void print(int row,int col)
	 
	{  int i=1,j=0,l=1;
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=col;j++)
			{   if(i==1||j==col)
				System.out.print("* ");
			else
			{
				System.out.print(" ");
			}
			}
			System.out.println();
		}*/

/*	****
	*  *
	*  *
	****
	
	public static void print(int row,int col)
	 
	{  int i=1,j=0,l=1;
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=col;j++)
			{   if(i==1||j==1||i==row||j==col)
				System.out.print("*");
			else
			{
				System.out.print(" ");
			}
			}
			System.out.println();
		}*/
/*
    * 
  *  
 *   
* 
  */
	/*	 public static void print(int row,int col)
		{  int i=1,j=0,l=1;
			for(i=1;i<=row;i++)
			{
				for(j=1;j<=col;j++)
				{   if(i+j==col+1)
					System.out.print("* ");
				else
				{
					System.out.print(" ");
				}
				}
				System.out.println();
			} */
/*	
    *    
	 *   
	  *  
	   * 
*/
	   
	/*   public static void print(int row,int col)
		{  int i=1,j=1;
			for(i=1;i<=row;i++)
			{
				for(j=1;j<=col;j++)
				{   if(i==j)
					System.out.print("* ");
				else
				{
					System.out.print(" ");
				}
				}
				System.out.println();
			}
			*/
	
	
/*	    * 
	   * * 
	  * * * 
	 * * * * *//*
			 public static void print(int row,int col)
				{  int i=1,j=1;
					for(i=1;i<=row;i++)
					{
						for(j=1;j<=col;j++)
						{   if(i+j>=row+1)
							System.out.print("* ");
						else
						{
							System.out.print(" ");
						}
						}
						System.out.println();
					}*/
			
/*	* * * * 
	 * * * 
	  * * 
	   * 
*/
	   
	public static void print(int row,int col)
	{  int i=1,j=1;
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=col;j++)
			{   if(i<=j)
				System.out.print("* ");
			else
			{
				System.out.print(" ");
			}
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		print(4,4);
	}

}
