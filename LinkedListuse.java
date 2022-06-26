package linkedlist;

public class LinkedListuse {
	
	public static void print(node<Integer>head) {
		//node<Integer>temp=head;
		while(head!=null) {
			 System.out.print(head.data+ " ");
			 head=head.next;
		 }
		 System.out.println();
//		System.out.println(node2);;
//		System.out.println(node1.next);
		// head=temp;
//		 while(head!=null) {
//			 System.out.print(head.data+ " ");
//			 head=head.next;
//		 }
//		
	}
	
	public static void main(String[] args) {
		node<Integer> node1=new node<Integer>(10);
//		System.out.println(node1.data);
//		System.out.println(node1.next);
		node<Integer> node2=new node<Integer>(20);
//		System.out.println(node2.data);
//		System.out.println(node2.next);
		node<Integer>node3=new node<Integer>(30);
		node<Integer>node4=new node<Integer>(40);
		node<Integer>node5=new node<Integer>(50);
		node<Integer>node6=new node<Integer>(60);
     	node1.next=node2;
     	node2.next=node3;
     	node3.next=node4;
     	
     	node4.next=node5;
		node5.next=node6;
		node6.next=null;
		node<Integer>head=node1;
//		 while(head!=null) {
//			 System.out.print(head.data+ " ");
//			 head=head.next;
//		 }
//		 System.out.println();
////		System.out.println(node2);;
////		System.out.println(node1.next);
//		 while(head!=null) {
//			 System.out.print(head.data+ " ");
//			 head=head.next;
//		 }
		
		print(head);
		
		print(head);
	}
	

}
