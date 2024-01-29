 
package linked_lists;

public class SinglyDemo {
	Node head;
	public class Node{
		private int data;
		private Node next = null;
		public Node(int data) {
			this.data=data;

		}
	}
	public void Elements() {
		head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		Node temp4 = new Node(50);
		head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
		temp3.next=temp4;

	}
	public void PrintList() {
		Node temp = head;
		while(temp.next!=null) {
			System.out.print(temp.data+"-->");temp=temp.next;
		}
		System.out.println("End of List");
	}

	public static void main(String[] args) {

		SinglyDemo singlyDemo = new SinglyDemo();
		singlyDemo.Elements();
		singlyDemo.PrintList();
	}

}
