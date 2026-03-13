// Last updated: 3/13/2026, 11:17:37 AM
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
17    int min = 0;
18    boolean tillK = false;
19    int c= 0;
20    public int kthSmallest(TreeNode root, int k) {
21        answer(root, k);
22        return min;
23    }
24    public void answer(TreeNode root, int k){
25        if(root == null){
26            return;
27        }
28        if(tillK == true){
29            return ;
30        }
31        answer(root.left, k);
32        c++;
33        if(c == k){
34            min = root.val;
35            tillK = true;
36        }
37        answer(root.right, k);
38    }
39}