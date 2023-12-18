package Datastructure;

public class BracketStack {
	static char[] stack;
	static int top;
	
	static void createStack(int size)
	{
		stack=new char[size];
		top=-1;
	}
	static void push(char ele)
	{
		
			top++;
			stack[top]=ele;
		
	}
	static void pop()
	{
	
			top--;
		
	}

	static boolean isEmpty()
	{
		return top==-1;
	}

	
	public static void main(String[] args) {
		String str="[][()(())]{}";
		createStack(str.length());
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='('||ch=='['||ch=='{')
			{
				push(ch);
			}
			else if((ch==')'||ch==']'||ch=='}')&&top!=-1 && (stack[top]=='('||stack[top]=='['||stack[top]=='{'))
			{
				pop();
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(isEmpty()&&flag==true)
		{
			
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Unbalanced");
		}
	}

}
