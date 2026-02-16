// Last updated: 2/17/2026, 12:46:12 AM
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
17    public TreeNode removeLeafNodes(TreeNode root, int target) {
18        return answer(root,target);
19        // return root;
20    }
21    public TreeNode answer(TreeNode root,int target){
22        if(root == null){
23            return null;
24        }
25        root.left = answer(root.left,target);
26        root.right = answer(root.right,target);
27        if(root.val == target){
28            if(root.left  == null && root.right==null){
29                return null;
30            }
31        }
32        return root;
33
34    }
35}