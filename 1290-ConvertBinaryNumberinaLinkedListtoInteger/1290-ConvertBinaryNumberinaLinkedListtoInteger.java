// Last updated: 2/2/2026, 2:16:10 PM
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
12    public int getDecimalValue(ListNode head) {
13        return answer(head);
14    }
15    public int answer(ListNode head){
16        int num =0;
17        ListNode temp = head;
18        while(temp != null){
19            int val = temp.val;
20            num = 2* num + val;
21            temp = temp.next;
22        }
23        
24        return num;
25    }
26}