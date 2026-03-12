// Last updated: 3/12/2026, 3:20:31 PM
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
17    List<List<Integer>> ans ;
18    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
19        ans = new ArrayList<>();
20        int sum =0;
21        List<Integer> ll = new ArrayList<>();
22        answer(root, targetSum, sum, ll);
23        return ans;
24    }
25
26    public void answer(TreeNode root, int tar, int sum, List<Integer> ll){
27        if(root == null){
28            return;
29        }
30        sum += root.val;
31        ll.add(root.val);
32        if(root.left == null && root.right == null){
33            if(tar == sum){
34                ans.add(new ArrayList<>(ll));
35            }
36        }
37
38        answer(root.left, tar, sum, ll);
39        answer(root.right, tar, sum ,ll);
40        ll.remove(ll.size()-1);
41    }
42}