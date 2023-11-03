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
		int[] notes= {1000,500,200,100,50,20,10};
		count(notes,amount);
		sc.close();
	}

}
