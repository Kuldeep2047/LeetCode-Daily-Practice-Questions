// Last updated: 3/13/2026, 2:27:32 PM
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
17    public TreeNode convertBST(TreeNode root) {
18        return answer(root);
19    }
20    int sum =0;
21    public TreeNode answer(TreeNode root){
22        if(root == null){
23            return null;
24        }
25        answer(root.right);
26        sum += root.val;
27        root.val = sum;
28        answer(root.left);
29        return root;
30    }
31}