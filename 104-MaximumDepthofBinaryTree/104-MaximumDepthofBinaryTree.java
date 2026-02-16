// Last updated: 2/16/2026, 11:59:20 AM
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
17    int maxd = 0;
18    public int maxDepth(TreeNode root) {
19        depth(root,1);
20        return maxd;
21    }
22    public void depth(TreeNode root,int cl){
23        if(root == null){
24            return;
25        }
26        if(cl>maxd){
27            maxd = cl;
28        }
29        depth(root.right,cl+1);
30        depth(root.left,cl+1);
31    }
32}