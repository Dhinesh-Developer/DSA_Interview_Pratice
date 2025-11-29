package LEETCODE_QUEST.Day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Q3. Insertion Sort List
Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.

The steps of the insertion sort algorithm:

Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
It repeats until no input elements remain.
The following is a graphical example of the insertion sort algorithm. The partially sorted list (black) initially contains only the first element in the list. One element (red) is removed from the input data and inserted in-place into the sorted list with each iteration.

Input: head = [4,2,1,3]
Output: [1,2,3,4]
* */
public class program1 {

      //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
         ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode insertionSortList(ListNode head) {
            ListNode temp = head;
            List<Integer> li = new ArrayList<>();
            while(temp!=null){
                li.add(temp.val);
                temp = temp.next;
            }

            Collections.sort(li);
            temp = head;
            for(Integer x : li){
                temp.val = x;
                temp = temp.next;
            }
            return head;
        }
    }
}
