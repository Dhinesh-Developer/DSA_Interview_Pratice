package GFG.Day19;
/*
Reverse a linked list

You are given the head of a singly linked list.
 You have to reverse the linked list and return the head of the reversed list.

Examples:

Input:

Output: 4 -> 3 -> 2 -> 1
Explanation: After reversing the linkedList

Input:

Output: 8 -> 9 -> 10 -> 7 -> 2
Explanation: After reversing the linked list

Input:

Output: 8
Explanation:

Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105
* */
public class program8 {

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


    class Solution {
        Node reverseList(Node head) {
            Node temp = head;
            Node prev = null;
            while(temp != null){
                Node front = temp.next;
                temp.next = prev;
                prev = temp;
                temp = front;
            }
            return prev;
        }
    }
}
