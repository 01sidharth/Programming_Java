package linkedlist;

public class LinkedListimpl {
	Node head;
	
	void insert(int ele)
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
		System.out.println(ele+"had been Inserted..!");
	}

}

