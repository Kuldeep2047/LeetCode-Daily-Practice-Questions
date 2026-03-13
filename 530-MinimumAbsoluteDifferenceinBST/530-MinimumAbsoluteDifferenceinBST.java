// Last updated: 3/13/2026, 4:11:38 PM
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
17    int prev = -1;
18    int ans = Integer.MAX_VALUE;
19    public int getMinimumDifference(TreeNode root) {
20        answer(root);
21        return ans;
22    }
23
24    public void answer(TreeNode root ){
25        if(root == null){
26            return;
27        }
28        answer(root.left);
29        if(prev != -1){
30            ans = Math.min(ans, root.val - prev);
31        }
32        prev = root.val;
33
34        answer(root.right);
35
36    }
37}