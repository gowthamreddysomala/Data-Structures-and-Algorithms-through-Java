public class LinkedList_Inserting_At_First {
	Node head  ;
	public class Node{
		private int data;
		private Node next ;
		public Node(int data) {
			this.data=data;
		}
	}

	public void insert(int data) {
		Node temp = new Node(data);
		if(head==null) {
			temp.next=head;
			head = temp;
		}
		else {
			temp.next = head;
			head = temp;

		}
	}

	public void Print() {
		Node temp = head;
		while(temp!=null) {
		System.out.print(temp.data + "-->");
		temp = temp.next;
		}
		System.out.println("End of list");
	}

	public static void main(String[] args) {

		LinkedList_Inserting_At_First liat=new LinkedList_Inserting_At_First();
		liat.insert(59);
		liat.insert(49);
		liat.insert(39);
		liat.insert(29);
		liat.insert(19);
		liat.insert(9);
		liat.Print();


	}

}
