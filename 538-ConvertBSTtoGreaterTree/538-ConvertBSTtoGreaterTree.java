// Last updated: 3/13/2026, 2:41:51 PM
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
18        // return answer(root);
19        answer(root);
20        return root;
21    }
22    int sum =0;
23    public void answer(TreeNode root){
24        if(root == null){
25            return ;
26        }
27        answer(root.right);
28        sum += root.val;
29        root.val = sum;
30        answer(root.left);
31        // return root;
32    }
33}