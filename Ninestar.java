
public class Ninestar {
	/*public static void print(int n,int m)//O(n^2)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
	
/*	public static void print(int n,int m)//O(n^2)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
/*	public static void print(int n,int m)//O(n^2)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}*/
	
/*	public static void print(int n,int m)//O(n^2)
	{   int l=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{   
				System.out.print(l+" ");
				l=l+1;
			}
			System.out.println();
			
		}*/
	
	/* public static void print(int n,int m)//O(n^2)
	{   int alpha = 65;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<m;j++)
			{   
				System.out.print((char)(alpha+j));
				
			}
			System.out.println();
			
		}*/
	/* public static void print(int n,int m)//O(n^2)
		{   int alpha = 65;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{   
					System.out.print((char)(alpha+j)+" ");
					
					
					if(j==m-1)
					{   int l=1;
					System.out.println();
						for(int k=1;k<=m;k++)
						{
							System.out.print(l+" ");
							l=l+1;
							
						}
					}
					
					
				}
				
				System.out.println();
				
			}*/
	public static void print(int n,int m)//O(n^2) mosin sirs method
	{   char x = 'A';
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<m;j++)
			{   
				System.out.print((x)+" ");
				
			}x++;
			System.out.println();
			
		}
	
	}
	public static void main(String[] args) {
		print(3,3);
	}

}
