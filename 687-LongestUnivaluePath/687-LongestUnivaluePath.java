// Last updated: 3/25/2026, 3:53:51 PM
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
17    int ans =0;
18    public int longestUnivaluePath(TreeNode root) {
19        answer(root);
20        return ans;
21        
22    }
23    public int answer(TreeNode root){
24        if(root == null){
25            return 0;
26        }
27        int left = answer(root.left);
28        int right = answer(root.right);
29
30        int leftans =0;
31        int rightans =0;
32        if(root.left != null  && root.left.val == root.val){
33            leftans = 1 + left;
34        }
35
36        if(root.right != null && root.right.val == root.val){
37            rightans = 1 + right;
38        }
39
40        ans = Math.max(leftans + rightans, ans);
41
42
43        return Math.max(leftans, rightans);
44    }
45}
46
47
48
49
50
51
52
53
54