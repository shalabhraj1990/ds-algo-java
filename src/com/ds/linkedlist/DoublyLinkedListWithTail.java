package com.ds.linkedlist;

public class DoublyLinkedListWithTail<T> {

	// Node inner class for DLL
	public class Node {
		public T data;
		public Node nextNode;
		public Node prevNode;
	}

	// member variables
	public Node headNode;
	public Node tailNode;
	public int size;

	// constructor
	public DoublyLinkedListWithTail() {
        this.headNode = null;
        this.tailNode = null; //null initially
        this.size = 0;
    }

	// returns true if list is empty
	public boolean isEmpty() {
		if (headNode == null && tailNode == null) // checking tailNode to make sure
			return true;
		return false;
	}

	// getter for headNode
	public Node getHeadNode() {
		return headNode;
	}

	// getter for tailNode
	public Node getTailNode() {
		return tailNode;
	}

	// getter for size
	public int getSize() {
		return size;
	}

	// print list function
	public void printList() {
		if (isEmpty()) {
			System.out.println("List is Empty!");
			return;
		}

		Node temp = headNode;
		System.out.print("List : null <- ");

		while (temp.nextNode != null) {
			System.out.print(temp.data.toString() + " <-> ");
			temp = temp.nextNode;
		}

		System.out.println(temp.data.toString() + " -> null");
	}
}
