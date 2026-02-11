// Last updated: 2/11/2026, 10:16:53 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
18        List<Integer> ll = new ArrayList<>();
19        getElement(root, ll);
20        List<List<Integer>> ans = new ArrayList<>();
21
22        for(int i=0 ;i<queries.size() ;i++){
23            int val = queries.get(i);
24            List<Integer> l2 = new ArrayList<>();
25
26            int min = getMin(ll, val);
27            int max = getMax(ll, val);
28
29            l2.add(min);
30            l2.add(max);
31            ans.add(l2);
32        }
33
34        return ans;
35
36    }
37
38    public int getMin(List<Integer> ll, int tar){
39        int l=0;
40        int r = ll.size() -1;
41        int ans =-1;
42        while(l<=r){
43            int mid = (l+r)/2;
44            if(ll.get(mid) <= tar){
45                ans = ll.get(mid);
46                l = mid+1;
47            }else{
48                r= mid-1;
49            }
50        }
51        return ans;
52    }
53
54    public int getMax(List<Integer> ll, int tar){
55        int l=0;
56        int r = ll.size()-1;
57        int ans =-1;
58        while(l<=r){
59            int mid = (l+r)/2;
60            if(ll.get(mid) >= tar){
61                ans = ll.get(mid);
62                r= mid-1;
63            }
64            else{
65                l = mid+1;
66            }
67        }
68        return ans;
69
70    }
71
72    public void getElement(TreeNode root , List<Integer> ll){
73        if(root == null){
74            return;
75        }
76
77        getElement(root.left, ll);
78        ll.add(root.val);
79        getElement(root.right, ll);
80    }
81}