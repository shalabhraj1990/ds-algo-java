package com.ds.linkedlist;

//Class node having Generic data-type <T>
public class Node<T> {
	public T data; // Data to store (could be int, string, Object etc)
	public Node nextNode; // Pointer to next node in list
	public Node prevNode; // Stores pointer to previous element [The Doubly Linked Lis]
}
