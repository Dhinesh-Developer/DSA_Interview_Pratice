package com.dk.Top100;
//Reverse Linked List
//Given the head of a singly linked list, reverse the list, and return the reversed list.
public class T8 {

    private static ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static void main(String[] args) {


    }
}
