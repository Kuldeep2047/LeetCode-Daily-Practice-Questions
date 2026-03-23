// Last updated: 3/23/2026, 3:47:01 PM
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
17    public int diameterOfBinaryTree(TreeNode root) {
18        return answer(root);
19    }
20
21    public int answer(TreeNode root){
22        if(root == null){
23            return 0;
24        }
25        int ld = answer(root.left);
26        int rd = answer(root.right);
27        int sd = height(root.left) + height(root.right) +2;
28
29        return Math.max(sd, Math.max(ld, rd));
30    }
31
32    public int height(TreeNode root){
33        if(root == null){
34            return -1;
35        }
36
37        int lh = height(root.left)+1;
38        int rh = height(root.right) +1;
39
40        return Math.max(lh, rh);
41    }
42}