package com.ds.linkedlist;

public class ReverseLinkedList {
	public static void main(String args[]) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		for (int i = 0; i < 15; i += 2)
			list.insertAtEnd(i);
		System.out.print("Before ");
		list.printList();
		reverse(list);
		System.out.print("After ");
		list.printList();
	}

//	Explanation #
//	The brain of this solution lies in the loop, which iterates through the list. For any current node, its link with the previous node is reverse and the next stores next node in the list:
//
//	Store the current node’s nextNode in next
//	Set current node’s nextNode to previous (reversal)
//	Make the current node the new previous so that it can be used for the next iteration
//	Use next to move on to the next node
//	In the end, we simply point the head to the last node in our loop.
	public static <T> void reverse(SinglyLinkedList<T> list) {
		Node previous = null; // To keep track of the previous element, will be used in swapping
													// links
		Node current = list.headNode; // firstElement
		Node next = null;

		// While Traversing the list, swap links
		while (current != null) {
			next = current.nextNode;
			current.nextNode = previous;
			previous = current;
			current = next;
		}
		// Linking Head Node with the new First Element
		list.headNode = previous;
	}
}
