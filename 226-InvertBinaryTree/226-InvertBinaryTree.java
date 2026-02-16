// Last updated: 2/16/2026, 3:09:28 PM
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
17    public TreeNode invertTree(TreeNode root) {
18        return answer(root);
19    }
20
21    public TreeNode answer(TreeNode root){
22        if(root == null){
23            return null;
24        }
25
26        TreeNode temp = root.left;
27        root.left = root.right;
28        root.right = temp;
29
30        answer(root.left);
31        answer(root.right);
32
33        return root;
34    }
35}