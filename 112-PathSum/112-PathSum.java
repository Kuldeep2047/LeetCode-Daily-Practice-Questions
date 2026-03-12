// Last updated: 3/12/2026, 3:08:56 PM
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
17    public boolean hasPathSum(TreeNode root, int targetSum) {
18        int sum =0;
19        return answer(root, targetSum, sum);
20    }
21
22    public boolean answer(TreeNode root, int tar, int sum){
23        if(root == null){
24            return false;
25        }
26        sum += root.val;
27        if(root.left == null && root.right == null){
28            if(tar == sum ){
29                return true;
30            }
31        }
32        
33        boolean left = answer(root.left, tar, sum);
34        boolean right = answer(root.right, tar, sum);
35
36        return left || right;
37    }
38}