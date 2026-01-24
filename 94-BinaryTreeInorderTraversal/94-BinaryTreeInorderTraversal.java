// Last updated: 1/24/2026, 12:29:29 PM
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> ll = new ArrayList<>();
19        answer(root, ll);
20        return ll;
21    }
22    public static void answer(TreeNode root, List<Integer> ll){
23        if(root == null){
24            return;
25        }
26        answer(root.left, ll);
27        ll.add(root.val);
28        answer(root.right, ll);
29    }
30}