package org.example.Seminar4.cw.Ex1;

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
//
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        ListNode current = head;
//        ListNode nextNode = null;
//        while (current != null) {
//            ListNode node = new ListNode(current.val);
//            node.next = nextNode;
//            nextNode = node;
//            current = current.next;
//        }
//        return nextNode;
//    }
//    public ListNode reverseList(ListNode head) {
//        ListNode pred = null;
//        ListNode current = head;
//        while(current != null){
//            ListNode nextElem = current.next;
//            current.next= pred;
//            pred = current;
//            current = nextElem;
//        }
//        return pred;
//    }
//
//}


