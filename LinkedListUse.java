package linkedlist2;

public class LinkedListUse {
	public static void print(node<Integer> head){
	    node<Integer> temp = head;

	    while(temp != null){
	        System.out.print(temp.data +" ");
	        temp = temp.next;
	    }
	    System.out.println();
	}

	public static void main(String args[]){

	    node<Integer> node1 = new node<Integer>(10);
	    node<Integer> node2 = new node<Integer>(20);
	    node<Integer> node3 = new node<Integer>(30);
	    node<Integer> node4 = new node<Integer>(40);
	    node1.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	       print(node2);
	   }
	}


