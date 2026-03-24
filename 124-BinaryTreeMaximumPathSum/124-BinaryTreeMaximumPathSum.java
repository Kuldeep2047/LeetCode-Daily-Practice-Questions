// Last updated: 3/24/2026, 7:08:04 PM
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
17    int ans = Integer.MIN_VALUE;
18    public int maxPathSum(TreeNode root) {
19        answer(root);
20        return ans;
21    }
22
23    public int answer(TreeNode root){
24        if(root == null){
25            return 0;
26        }
27        int left = answer(root.left);
28        int right = answer(root.right);
29
30        int a = left + root.val + right;
31        int b = Math.max(left, right) + root.val;
32        int c = root.val;
33
34        ans = Math.max(Math.max(ans, a), Math.max(b,c));
35
36        return Math.max(b, c);
37    }
38}