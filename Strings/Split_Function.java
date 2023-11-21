package Strings;

import java.util.Scanner;

public class Split_Function {
  public static String[] check(String str,char a,char b,char c)
  {
	  int word=words(str,' ','.','/');
	  String[] res=new String[word];
	  int index=0;
	  for(int i=0;i<res.length;i++)
	  {
		  res[i]="";
	  }
		  for(int j=0;j<str.length();j++)
		  {
			  if(str.charAt(j)==a || str.charAt(j)==b || str.charAt(j)==c)
			  {
				  index++;
			  }
			  else
			  {
				  res[index]=(res[index])+str.charAt(j);
			  }
		  }
		  
		  for(int i=0;i<res.length;i++)
		  {
			  System.out.println(res[i]);
		  }
		  return res;
	  
  }
  public static int words(String str,char a,char b,char c)
	{
		int d=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==a || str.charAt(i)==b || str.charAt(i)==c)
			{
				d++;
			}
		}
		return d+1;
	}
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.nextLine();
		check(str,' ','.','/');
		sc.close();
	}
}
