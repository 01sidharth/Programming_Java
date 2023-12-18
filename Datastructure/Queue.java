package Datastructure;

import java.util.Scanner;

public class Queue {
	static int[] queue;
	static int rear;
	static int front;
	static void createQueue(int size)
	{
		queue =new int[size];
		rear=0;
		front=0;
		System.out.println("Queue has been created with size:"+size);
	}
	static void enqueue(int ele)
	{	if(queue.length==rear)
		{
			System.out.println("Queue is full");
		}
		else
		{
			queue[rear]=ele;
			rear++;
			System.out.println("Enqueued element:"+ele);
		}
		
	}
	static void dequeue()
	{
		if(rear==front)
		{
			System.out.println("Queue is Empty");
		}
		else
		{	System.out.println("Dequeued:"+queue[front]);
			
			for(int i=front;i<rear-1;i++)
			{  
				queue[i]=queue[i+1];
			}
			rear--;
			
		}
	}
	static void display()
	{  System.out.println("queue elements:");
		for(int i=0;i<rear;i++)
		{
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}
	static void clear()
	{
		rear=0;
	}
	static void isEmpty()
	{
		if(rear==front)
		{
			System.out.println("queue is Empty");
		}
		else
		{
			System.out.println("queue is not Empty");
		}
	}
	static void full()
	{
		if(rear==queue.length)
		{
			System.out.println("queue is full");
		}
		else
		{
			System.out.println("queue is not full");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		createQueue(5);
//		enqueue(5);
//		enqueue(10);
//		enqueue(15);
//		enqueue(25);
//		enqueue(35);
//		enqueue(45);
//		dequeue();
//		dequeue();
//		display();
//		enqueue(50);
//		enqueue(60);
//		dequeue();
//		display();
		System.out.println("Queue Operations");
		while(true)
		{
			System.out.println("=============Queue menu=============");
			System.out.println("1.createQueue\t2.Enqueue\t3.Dequeue\t4.Display\t5.clear \t 6.isEmpty\t7.isFull\t8.Exit");
			int op=sc.nextInt();
			switch(op)
			{
			case 1:System.out.println("Enter the size of Queue");
				int size=sc.nextInt();
				createQueue(size);
				break;
			case 2:System.out.println("Enter the Element to add in Queue");
				int ele=sc.nextInt();
				enqueue(ele);
				break;
			case 3:dequeue();
			break;
			
			case 4:display();
			break;
			case 5:System.out.println("Queue cleared");
			clear();
			break;
			case 6:isEmpty();
			break;
			case 7:full();
			break;
			case 8:System.out.println("successfully Exited");
			System.exit(0);
			break;
			default:System.out.println("Enter the Valid Option");
			break;
			
			}
		}
		
	}

}
