package Datastructure;

import java.util.Scanner;

public class Stack_prgm {
	static int[] stack;
	static int top;
	
	static void createStack(int size)
	{
		stack=new int[size];
		top=-1;
		System.out.println("stack had been created with size:"+size);
	}
	static void push(int ele)
	{
		if(top==stack.length-1)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			top++;
			stack[top]=ele;
			System.out.println(ele+"->Had been Added");
		}
	}
	static void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			System.out.println(stack[top]+":Element poped");
			stack[top]=0;
			top--;
		}
	}
	static void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(stack[i]);
			}
		}
	}
	static boolean isEmpty()
	{
		return top==-1;
	}
	static void clear()
	{
		System.out.println("Stack has been Cleared");
		top=-1;
	}
	static boolean isFull() {
		return top==stack.length-1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=========Stack Implementation============");
		while(true) {
				System.out.println("====MENU====");
				System.out.println("1.CreateStack\n2.Push\n3.pop\n4.Display\n5.IsEmpty\n6.IsFull\n7.Clear\n8.Exit\nEnter the Option:");
				int op=sc.nextInt();
				switch(op)
				{
				case 1:System.out.println("Enter the Size of Stack");
				int size=sc.nextInt();
				createStack(size);
				break;
				case 2:System.out.println("Enter the Element to push");
				int ele=sc.nextInt();
				push(ele);
				break;
				case 3:pop();
				break;
				case 4:System.out.println("Stack Elements");
				display();
				break;
				case 5:
				System.out.println(isEmpty());
				break;
				case 6:
				System.out.println(isFull());
				break;
				case 7:clear();
				break;
				case 8:System.out.println("Succesfully Exited");
				System.exit(0);
				break;
				default:System.out.println("Enter the Valid Option");
				}
		}
	}
}
