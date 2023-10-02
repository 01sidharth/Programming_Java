import java.util.Scanner;
public class CheckPrime {
	


		public static boolean prime(int x)// time complexity  O(n/2)
		{
		//                         Prime Number checking using count
			
		
		
	   for(int i=2;i<=x-1;i++)
			{
				if(x%i==0)
				{
					
					return false;
				}
			}return true;
			
		}
		
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Number:");
			int b =sc.nextInt();
			
			System.out.println(prime(b));
			sc.close();
		}

	}

