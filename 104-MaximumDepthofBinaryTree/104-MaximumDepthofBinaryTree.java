// Last updated: 2/16/2026, 2:40:02 PM
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
17    public boolean isBalanced(TreeNode root) {
18        int ans =  answer(root);
19        if(ans == -1){
20            return false;
21        }
22        return true;
23    }
24
25    public int answer(TreeNode root){
26        if(root == null){
27            return 0;
28        }
29
30        int left = answer(root.left);
31        if(left == -1){
32            return -1;  //-1 -> height difference is more than one
33        }
34
35        int right = answer(root.right);
36        if(right == -1){
37            return -1;
38        }
39
40        if(Math.abs(left - right) > 1){
41            return -1;
42        }
43
44        return Math.max(left, right) + 1;
45    }
46}