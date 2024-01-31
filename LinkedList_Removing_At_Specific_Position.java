

public class LinkedList_Removing_At_Specific_Position // extends Thread
{
	public Node head;
	public int LinkedListSize = 0;
	public class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	public void insertatfirst(int data) {
		Node value = new Node(data);
		Node temp = head;
		if(head == null) {
			value.next=head;
			head = value;
		}
		else {
			LinkedListSize++;
			value.next=head;
			head = value;
		}

	}
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		//	try {Thread.sleep(1000);}catch(Exception e) {}
		}
		System.out.println("End of List");
		System.out.println("size "+LinkedListSize);
	}
	public void Remove_atSpecificPosition(int pos) {
		pos --;
		LinkedListSize--;
		Node temp = head;
		for(int i = 0; i<pos;i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	public static void main(String[] args) {
		LinkedList_Removing_At_Specific_Position lr =new LinkedList_Removing_At_Specific_Position();
		lr.insertatfirst(90);
		lr.insertatfirst(80);
		lr.insertatfirst(70);
		lr.insertatfirst(60);
		lr.insertatfirst(50);
		lr.insertatfirst(40);
		lr.insertatfirst(30);
		lr.insertatfirst(20);
		lr.insertatfirst(10);
		lr.insertatfirst(00);
		lr.print();
		lr.Remove_atSpecificPosition(3);
		lr.print();

	}

}
