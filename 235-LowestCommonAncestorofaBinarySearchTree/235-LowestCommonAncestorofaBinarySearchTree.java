// Last updated: 3/13/2026, 3:18:46 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        return LCA(root,p,q);
14    }
15
16    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
17        if(root == null){
18            return null;
19        }
20        if(root == p || q == root){
21            return root;
22        }
23
24
25        TreeNode left = LCA(root.left,p,q);
26        TreeNode right = LCA(root.right,p,q);
27
28        if(left != null && right != null){
29            return root;
30        }
31        if(left == null){
32            return right;
33        }else{
34            return left;
35        }
36    }
37}