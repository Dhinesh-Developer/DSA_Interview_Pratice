package LEETCODE_QUEST.Day9;
//Q1. Remove Duplicates from Sorted List
public class program3 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode temp = head;
            while(temp!=null && temp.next!=null){
                if(temp.val == temp.next.val){
                    temp.next = temp.next.next;
                }else{
                    temp = temp.next;
                }

            }
            return head;
        }
    }
}
