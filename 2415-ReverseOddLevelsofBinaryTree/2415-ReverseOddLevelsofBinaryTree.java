// Last updated: 2/10/2026, 10:07:47 PM
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
17    public TreeNode reverseOddLevels(TreeNode root) {
18        answer(root.left, root.right, 1);
19        return root;
20    }
21
22    public void answer(TreeNode l, TreeNode r, int level){
23        if(l == null || r== null){
24            return;
25        }
26
27        if(level % 2 == 1){
28            int t = l.val;
29            l.val = r.val;
30            r.val = t;
31        }
32
33        answer(l.left, r.right, level+1);
34        answer(l.right, r.left, level+1);
35    }
36}