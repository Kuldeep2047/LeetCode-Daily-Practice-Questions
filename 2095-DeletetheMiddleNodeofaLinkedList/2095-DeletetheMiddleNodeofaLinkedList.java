// Last updated: 2/2/2026, 12:06:17 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13        return answer(head);
14    }
15    public static ListNode answer(ListNode head){
16        if(head ==null || head.next==null){
17            return null;
18        }
19        ListNode slow = head;
20        ListNode fast = head;
21        ListNode prev = null;
22        while(fast != null && fast.next != null){
23            prev = slow;
24            slow = slow.next;
25            fast = fast.next.next;
26            
27            
28        }
29        prev.next = slow.next;
30        slow = null;
31        return head;
32    }
33}