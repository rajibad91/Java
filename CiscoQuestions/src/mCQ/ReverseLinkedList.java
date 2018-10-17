package mCQ;

import java.util.LinkedList;

public class ReverseLinkedList {

	private static class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;

		}
	}
	public static Node reverseLinkedList(Node node) {
		if (node == null || node.next == null) {
			return node;
		}
 
		Node remaining = reverseLinkedList(node.next);
		node.next.next = node;
		node.next = null;
		return remaining;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// Creating a linked list
		Node head=new Node(5);
		list.addLast(head);
		list.addLast(new Node(6));
		list.addLast(new Node(7));
		list.addLast(new Node(1));
		list.addLast(new Node(2));
 
		System.out.println(list);
		printList(head);
		//Reversing LinkedList
		Node reverseHead=reverseLinkedList(head);
		System.out.println("After reversing");
		printList(reverseHead);
		
		//System.out.println(list);
 
	}
	
	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
}


