package Array;

import java.util.Scanner;

public class MoneyProblem {
	public static int count(int [] notes,int amount)
	{
		int total=0;
		for(int i=0;i<notes.length;i++)
		{
			total=total+amount/notes[i];
			System.out.println(notes[i]+"----->" +amount/notes[i]);
			if(amount%notes[i]==0)
			{
				break;
			}
			amount=amount%notes[i];
		}
		return total;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount=sc.nextInt();
		int n=sc.nextInt();
		int [] notes=new int[n];
        for(int i=0;i<n;i++)
        {
            notes[i]=sc.nextInt();
        }
		count(notes,amount);
		sc.close();
	}

}
