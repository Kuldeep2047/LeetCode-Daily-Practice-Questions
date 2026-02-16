// Last updated: 2/16/2026, 12:00:03 PM
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
18    public int maxDepth(TreeNode root) {
19        answer(root, 1);
20        return ans;
21    }
22
23    public void answer(TreeNode root, int c){
24        if(root == null){
25            return;
26        }
27        if(c >= ans){
28            ans = c;
29        }
30
31        answer(root.left, c+1);
32        answer(root.right, c+1);
33    }
34}