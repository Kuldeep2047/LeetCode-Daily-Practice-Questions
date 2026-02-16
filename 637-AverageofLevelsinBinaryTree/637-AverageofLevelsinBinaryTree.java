// Last updated: 2/16/2026, 3:53:30 PM
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
17    public List<Double> averageOfLevels(TreeNode root) {
18        List<Double> ans = new ArrayList<>();
19        Queue<TreeNode> q = new LinkedList<>();
20        q.add(root);
21
22        while(!q.isEmpty()){
23            int size = q.size();
24            double sum = 0;
25        
26            for(int i=0 ;i<size ;i++){
27                TreeNode r = q.poll();
28                sum += r.val;
29                if(r.left != null){
30                    q.add(r.left);
31                }
32                if(r.right != null){
33                    q.add(r.right);
34                }
35            }
36            ans.add(sum / size);
37
38        }
39        return ans;
40
41    }
42}