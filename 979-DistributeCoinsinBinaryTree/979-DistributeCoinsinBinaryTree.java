// Last updated: 3/23/2026, 3:14:03 PM
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
18    public int distributeCoins(TreeNode root) {
19        minmove(root);
20        return ans;
21        
22    }
23    public int minmove(TreeNode root) {
24        if(root == null){ 
25            return 0;
26        }
27        
28        int left = minmove(root.left);
29        int right = minmove(root.right);
30        ans = ans + Math.abs(left)+ Math.abs(right);
31        return root.val+ left + right -1;
32        
33    }
34}