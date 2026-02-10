// Last updated: 2/10/2026, 11:19:03 PM
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
17    long max=0;
18    public int maxProduct(TreeNode root) {
19        max=0;
20        helper(root);
21        answer(root,root.val);
22        return (int)(max%1_000_000_007);
23    }
24
25    public long helper(TreeNode root){
26        if(root==null){
27            return 0;
28        }
29        if(root.left==null && root.right==null){
30            return root.val;
31        }
32        
33        long left=helper(root.left);
34        long right=helper(root.right);
35        long sum=left+right+root.val;
36        root.val=(int)sum;
37        return sum;
38
39    }
40    public void answer(TreeNode root,int tsum){
41        if(root==null){
42            return;
43        }
44        long x = tsum - root.val;
45        long p=(x*root.val);
46        max=Math.max(p,max);
47        answer(root.left,tsum);
48        answer(root.right,tsum);
49    }
50}