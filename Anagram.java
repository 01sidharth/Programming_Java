package Datastructure;

public class Anagram {
	static String sort(String s)
	{    char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{	
			for(int j=0;j<ch.length-1-i;j++)
			{	
				if(ch[j]>ch[j+1])
				{
					char temp=ch[j];
				       ch[j]=ch[j+1];
				       ch[j+1]=temp;
					
				}				
			}
			
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		String s1="hello";
		String s2="llohe";
		if(sort(s1).equals(sort(s2)))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
