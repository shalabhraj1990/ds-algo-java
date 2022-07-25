package com.ds.hundred;

public class Day23LiskedListCycle2 {
	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(-4);
		head.next.next.next = head.next;

		System.out.println(detectCycle(head).val);
	}

	private static ListNode detectCycle(ListNode head) {
		ListNode slow = head,fast = head;
		ListNode insPoint = null;
		while(true) {
			if(fast == null || fast.next == null) {
				return null;
			}
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				insPoint = slow;
				break;
			}
		}
		
		ListNode statNode = head;
		while(insPoint != null && statNode != insPoint) {
			statNode = statNode.next; 
			insPoint = insPoint.next;
		}
		return statNode;
	}
}


