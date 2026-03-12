// Last updated: 3/12/2026, 11:09:09 AM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> ll = new ArrayList<>();
19        if(root == null){
20            return ll;
21        }
22        answer(root, ll);
23        return ll;
24    }
25
26    public List<List<Integer>> answer(TreeNode root, List<List<Integer>> ll){
27        Queue<TreeNode> q = new LinkedList<>();
28        q.add(root);
29
30        while(!q.isEmpty()){
31            List<Integer> ans = new ArrayList<>();
32            int size = q.size();
33            for(int i=0 ;i<size ;i++){
34                TreeNode r = q.poll();
35                ans.add(r.val);
36                if(r.left != null){
37                    q.add(r.left);
38                }
39                if(r.right != null){
40                    q.add(r.right);
41                }
42            }
43            ll.add(new ArrayList<>(ans));
44        }
45        return ll;
46    }
47}