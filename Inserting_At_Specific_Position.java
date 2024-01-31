 //Uncomment extends Thread to see operations printing delayed by 1000 milliseconds
 //also uncomment the try block in print method (important) to slow printing
 //if you dont want ignore these comments
public class Inserting_At_Specific_Position // extends Thread
{
	public Node head;
	public int length_of_LinkedList = 0;
	public class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	public void  insertAtLAst(int data) {
		Node temp = new Node(data);
		if(head == null) {
			temp.next = head;
			head = temp;
		}
		else {
			Node temp2 = head;
			length_of_LinkedList++;
			while(temp2.next!=null) {
				temp2=temp2.next;
			}
			temp2.next=temp;
		}
	}
	public void print()  {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
			//try{Thread.sleep(1000);}catch(Exception e) {}
		}
		System.out.println("End of List");
		System.out.println("length : "+length_of_LinkedList);
	}
	public void insert_in_specific_position(int value,int position) {
		position --;

		Node temp = head;
		Node data = new Node(value);
		for(int i=0;i<position;i++) {
			temp = temp.next;
		}
			Node pre = temp;
			Node next = temp.next;
			pre.next = data;
			data.next = next;
	}
	//driver code
	public static void main(String[] args) {
		Inserting_At_Specific_Position is = new Inserting_At_Specific_Position();
		is.insertAtLAst(10);
		is.insertAtLAst(20);
		is.insertAtLAst(30);
		is.print();
		is.insert_in_specific_position(2, 0);
		is.print();
		//written by Gowtham Reddy Somala

	}

}
