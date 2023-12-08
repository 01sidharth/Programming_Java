package Datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PalindromeInFile {
	static void ispalindrome(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println(rev);
		}
	}
	public static void main(String[] args) throws IOException {
		FileReader f1=new FileReader("Pal.txt");
					BufferedReader b1=new BufferedReader(f1);
					String s="";
					while((s=b1.readLine())!=null)
					{
						String [] arr=s.split(" ");
						for(String ele:arr)
						{
							ispalindrome(ele);
						}
						
					}
				
	}
}
