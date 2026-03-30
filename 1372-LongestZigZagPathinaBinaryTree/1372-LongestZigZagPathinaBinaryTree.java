// Last updated: 3/30/2026, 3:53:07 PM
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
17    int ans =0;
18    public int longestZigZag(TreeNode root) {
19        answer(root, 0, 0);
20        answer(root, 0, 1);
21
22        return ans;
23    }
24//  if val == 1 go to right and if val ==0 go ot left
25    public void answer(TreeNode root, int len, int val){
26        if(root == null){
27            return;
28        }
29
30        ans = Math.max(ans, len);
31
32        if(val == 0){
33
34            answer(root.left, len +1, 1);
35            answer(root.right, 1, 0);
36        }else{
37
38            answer(root.right, len+1, 0);
39            answer(root.left, 1, 1);
40
41        }
42    }
43}