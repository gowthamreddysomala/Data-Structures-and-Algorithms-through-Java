//uncomment extends Thread class, to slow down the printing process of Linked List and also uncomment the try block in Print Method
public class LinkedList_Inserting_At_Last //extends Thread
{
	public class Node{
		private int data;
		private Node next = null;
		public Node(int data) {
			this.data=data;
		}
	}
	public Node head;
public void InsertingAtLast(int data) {
	Node temp = new Node(data);
	if(head==null) {
		temp.next=head;
		head = temp;
	}
	else {
		Node temp1 = head;
		while(temp1.next!=null) {
			temp1 = temp1.next;
		}
		temp1.next = temp;
	}
}
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			//uncomment the below line experience 1 second delay in printing .
			//try {Thread.sleep(1000);} catch (InterruptedException e) {}
			temp = temp.next;
		}
		System.out.println("End");
	}

	public static void main(String[] args) {
		LinkedList_Inserting_At_Last last = new LinkedList_Inserting_At_Last();
		//add Values to Linked list as Shown Below.
		last.InsertingAtLast(10);
		last.InsertingAtLast(20);
		last.InsertingAtLast(30);
		last.InsertingAtLast(40);
		last.InsertingAtLast(90);
		// last.print()  is used to print the values;
		last.print();

	}
	//Written By Gowtham Reddy Somala

}
