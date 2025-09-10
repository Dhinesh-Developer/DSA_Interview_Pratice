package com.pattern.slowAndFastPointers;

class Node{
	
	int data;
	Node next;
	
	Node(int data,Node next){
		this.data = data;
		this.next = next;
	}
	
	Node(int data){
		this.data = data;
	}
}

public class SF1 {
	
	private static Node convertToLinkedList(int[] nums) {
		if(nums.length == 0) return null;
		
		Node head = new Node(nums[0]);
		Node cur = head;
		
		for(int i=1;i<nums.length;i++) {
			cur.next = new Node(nums[i]);
			cur = cur.next;
		}
		
		return head;
	}
	
	private static void traversal(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	
	private static boolean hasCycle(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast !=null && fast.next !=null) {
			slow=  slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
	
	
	private static Node reverse(Node head) {
		Node temp = head;
		Node prev = null;
		while(temp != null) {
			Node front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}
		return prev;
	}
	
	private static Node middleOfLL(Node head) {
		//if(head == null || head.next !=null) return null;
		
		Node slow = head,fast = head;
		while(fast!=null && fast.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	private static int lengthOfTheLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				int cnt = 1;
				fast = fast.next;
				while( fast !=null) {
					cnt++;
					fast = fast.next;
				}
				return cnt;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		//int[] nums = {3,2,0,-4,2};
		Node head = convertToLinkedList(nums);
		
		// 1. detect a ll cycle.
//		boolean res1 = hasCycle(head);
//		System.out.println(res1);
//		
//		//2. reverse an linked list
//		Node res2 = reverse(head);
//		traversal(res2);
		
		//3. middle of the LL.
		Node res3 = middleOfLL(head);
		System.out.println(res3.data);
		
		int res4 = lengthOfTheLoop(head);
		System.out.println(res4);
		
		
		traversal(head);
		
	}
}
