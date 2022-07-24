package com.ds.hundred;

public class Day16_LiskedListCycle {
	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(-4);
		head.next.next.next = head.next;

		System.out.println(hasCycle(head));
	}

	public static boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}

		ListNode fist = head, secound = head;

		do {
			fist = fist.next;
			secound = secound.next.next;
			if (fist == secound) {
				return true;
			}
		} while (fist != null && secound != null && secound.next != null);
		return false;

	}

}

//Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
