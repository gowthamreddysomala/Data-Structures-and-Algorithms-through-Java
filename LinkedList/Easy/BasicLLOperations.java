package LinkedList.Easy;

public class BasicLLOperations {
    public class Node{
        private int data;
        private Node next;
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    public  void addingnode(int data){
        // head
        Node head = new Node(data,null);
        Node temp = new Node(11,null);
        Node temp2 = new Node(12,null);
        Node temp3 = new Node(13,null);
        head.next = temp;
        temp.next = temp2;
        temp2.next = temp3;
        print(head);
    }
    public static void print(Node node){
        Node temp = node;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
    BasicLLOperations basicLLOperations = new BasicLLOperations();
    basicLLOperations.addingnode(10);

    }
}
