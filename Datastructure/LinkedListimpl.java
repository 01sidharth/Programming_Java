package linkedlist;

public class LinkedListimpl {
	Node head;
	
	void insertlast(int ele)
	{
		Node n=new Node(ele);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
		System.out.println(ele+":had been Inserted..!");
	}
	void insertfrond(int ele)
	{
		Node n=new Node(ele);
		if(head==null)
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}
	void display() {
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{	System.out.println("LinkedList Data:");
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	void deletelast()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else if(head.next==null)
		{
			System.out.println(head.data+ ":deleted");
			head=null;
		}
		else
		{
			Node temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			System.out.println(temp.next.data+":deleted");
			temp.next=null;
		}
	}
	void deletefrond() {
		if(head==null)
		{
			System.out.println("LinkedList is Empty");
		}
		else
		{
			System.out.println(head.data+":deleted");
			head=head.next;
		}
	}
	void delete(int ele)
	{
		if(head==null)
		{
			System.out.println("LinkedList is Empty");
		}
		else if(head.data==ele)
		{
			System.out.println(ele+":deleted");
			head=head.next;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{   if(temp.next.data==ele)
				{
				System.out.println(temp.next.data+":deleted");
				temp.next=temp.next.next;
				return;
				}
			    temp=temp.next;
				
			}
		}
	}

}

