package Datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoOfWordsInFile {
	public static void main(String[] args) throws IOException {
		FileReader f1=new FileReader("test.txt");
					BufferedReader b1=new BufferedReader(f1);
					String s="";
					int c=0;
					int l=0;
					while((s=b1.readLine())!=null)
					{
						String [] arr=s.split(" ");
						c=c+arr.length;
						l++;
						
					}
					System.out.println("No Of words:"+c);
					System.out.println("No of Lines:"+l);
	}
}
