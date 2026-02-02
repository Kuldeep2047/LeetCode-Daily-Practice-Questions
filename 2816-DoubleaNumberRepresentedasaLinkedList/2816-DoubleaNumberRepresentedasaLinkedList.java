// Last updated: 2/2/2026, 2:39:19 PM
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
12    public ListNode doubleIt(ListNode head) {
13        return answer(head);
14    }
15    public ListNode answer(ListNode head){
16        ListNode head2 = reverse(head);
17        ListNode temp = head2;
18        int carry =0;
19        while(temp != null){
20            int sum = temp.val *2 + carry;
21            temp.val = sum%10;
22            carry = sum/10;
23
24            if(temp.next == null &&  carry > 0){
25                temp.next = new ListNode(carry);
26                break;
27            }
28            temp = temp.next;
29
30        }
31        return reverse(head2);
32    }
33    public ListNode reverse(ListNode head){
34        ListNode temp = head;
35        ListNode prev = null;
36        while(temp != null){
37            ListNode next = temp.next;
38            temp.next = prev;
39            prev = temp;
40            temp= next;
41        }
42        return prev;
43    }
44}