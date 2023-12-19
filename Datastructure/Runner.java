package linkedlist;

import java.util.Scanner;

public class Runner {
 public static void main(String[] args) {
	LinkedListimpl li=new LinkedListimpl();
//	li.display();
//	li.insertlast(5);
//	li.insertlast(10);
//	li.insertlast(15);
//	li.display();
//	li.insertlast(36);
//	li.display();
//	li.deletelast();
//	li.display();
//	li.deletefrond();
//	li.display();
//	li.deletefrond();
//	li.display();
//	li.insertfrond(100);
//	li.display();
//	li.insertfrond(200);
//	li.display();
//	li.insertlast(300);
//	li.display();
//	li.deletefrond();
//	li.display();
//	li.deletelast();
//	li.display();
//	li.insertfrond(1000);
//	li.insertfrond(1060);
//	li.insertfrond(3000);
//	li.display();
//	li.delete(1000);
//	li.display();
//	li.delete(3000);
//	li.display();
	Scanner sc=new Scanner(System.in);
	System.out.println("=============LinkedList Operation===================");
	while(true)
	{
		System.out.println("=============MENU===============");
		System.out.println("1.insert data\t 2.insertLast \t 3.insertFrond \t4.DeleteLast \t5.DeleteFrond\t6.DeleteData \t7.Display\t8.exit");
		int op=sc.nextInt();
		switch(op)
		{
		case 1:System.out.println("Enter the Element to Insert:");
		int ele=sc.nextInt();
		li.insertlast(ele);
		break;
		case 2:System.out.println("Enter the Element to Insert at Last");
		int ele1=sc.nextInt();
		li.insertlast(ele1);
		break;
		case 3:System.out.println("Enter the Element to Insert at Frond");
		int ele2=sc.nextInt();
		li.insertfrond(ele2);
		break;
		case 4:li.deletelast();break;
		case 5:li.deletefrond();break;
		case 6:System.out.println("Enter the Element to delete:");
		int ele3=sc.nextInt();
		li.delete(ele3);
		break;
		case 7:li.display();break;
		case 8:System.out.println("Successfully Exited :)");
		System.exit(0);
		break;
		default:System.out.println("Enter the valid Option");
		break;
		}
	}
	
	


	
}
}
