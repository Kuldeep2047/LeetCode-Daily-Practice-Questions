// Last updated: 3/12/2026, 2:38:19 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12        return answer(root, p, q);
13    }
14
15    public static TreeNode answer(TreeNode root, TreeNode p, TreeNode q){
16        if(root == null){
17            return null;
18        }
19
20        if(root == p || root == q){
21            return root;
22        }
23
24        TreeNode left = answer(root.left, p, q);
25        TreeNode right = answer(root.right, p, q);
26
27        if(left != null && right != null){
28            return root;
29        }
30        if(left == null){
31            return right;
32        }else{
33            return left;
34        }
35    }
36}