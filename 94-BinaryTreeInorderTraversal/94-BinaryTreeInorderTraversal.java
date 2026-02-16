// Last updated: 2/16/2026, 10:51:00 AM
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> ll = new ArrayList<>();
19        // answer(root,ll);
20        // return ll;
21
22        if(root == null){
23            return ll;
24        }
25
26        Stack<TreeNode> st = new Stack<>();
27        TreeNode curr = root;
28        while(curr != null || !st.isEmpty()){
29            
30
31            while(curr != null){
32                st.push(curr);
33                curr = curr.left;
34            }
35
36            curr = st.pop();
37            ll.add(curr.val);
38
39            curr = curr.right;
40            
41
42        }
43
44        
45        return ll;
46        
47        
48    }
49    public void answer2(TreeNode root, Stack<Integer> st){
50        if(root == null){
51            return;
52        }
53
54
55
56    }
57
58    // public void answer(TreeNode root, List<Integer> ll){
59    //     if(root == null){
60    //         return;
61    //     }
62    //     answer(root.left, ll);
63    //     ll.add(root.val);
64    //     answer(root.right, ll);
65    // }
66}
67
68
69
70
71
72
73
74
75
76
77
78