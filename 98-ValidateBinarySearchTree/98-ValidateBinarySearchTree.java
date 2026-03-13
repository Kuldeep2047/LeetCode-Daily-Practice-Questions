// Last updated: 3/13/2026, 11:04:19 AM
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
17    public boolean isValidBST(TreeNode root) {
18        if(root.left == null && root.right == null){
19            return true;
20        }
21        return answer(root, Long.MIN_VALUE, Long.MAX_VALUE);
22    }
23
24    public boolean answer(TreeNode root, long left, long right){
25        if(root == null){
26            return true;
27        }
28        if(root.val <= left || root.val >= right){
29            return false;
30        }
31
32        boolean leftValid = answer(root.left, left, root.val);
33        boolean rightValid = answer(root.right, root.val, right);
34
35        return leftValid && rightValid;
36    }
37}