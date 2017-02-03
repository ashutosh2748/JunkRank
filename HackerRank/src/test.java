 class Node {
	     int data;
	     Node next;
	     
	  }
	


public class test {
	
	 /* Print elements of a linked list on console 
	  head pointer input could be NULL as well for empty list
	  Node is defined as*/ 
	 
public static void main(String Args[]){
	// This is a "method-only" submission. 
	// You only need to complete this method.
	Node abc=new Node();
	abc.data=5;
	abc.next=new Node();
	abc.next.data=10;
	abc.next.next=null;
	
	System.out.println();
	Insert(abc,7);
	Print(abc);
}
	static void Print(Node head)
	{
	 if(head!=null){ System.out.println(head.data);
	  Print(head.next);
	 }
	}
	static Node Insert(Node head,int data) {
		// This is a "method-only" submission. 
		// You only need to complete this method.
		
		Node test=head;
		while (test.next!=null)
			test=test.next;
		test.next=new Node();
		test=test.next;
		test.data=data;
		test.next=null;
		    return head;
	}



}
