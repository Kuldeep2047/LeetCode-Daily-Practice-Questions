// Last updated: 2/6/2026, 12:33:02 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public Node flatten(Node head) {
13        Stack<Node> st = new Stack<>();
14        Node curr = head;
15        Node back = null;
16        while(curr != null){
17            if(curr.child != null){
18                if(curr.next != null){
19                    st.push(curr.next);
20                }
21               
22                curr.next = curr.child;
23                curr.child.prev = curr;
24                curr.child = null;
25            }
26            if(curr.next == null && !st.isEmpty()){
27                curr.next = st.pop();
28                curr.next.prev = curr;
29
30            }
31            curr = curr.next;
32        }
33
34        return head;
35    }
36}