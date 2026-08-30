// Last updated: 8/30/2026, 10:54:42 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14       
15        ListNode pcr =headA;
16        ListNode vgf = headB;
17        while(pcr!=vgf){
18            if(pcr==null){
19                pcr = headB;
20            }else{
21                pcr = pcr.next;
22            }
23            if(vgf==null){
24                vgf = headA;
25            }else{
26                vgf = vgf.next;
27            }
28        }
29        return pcr;
30
31    }
32}