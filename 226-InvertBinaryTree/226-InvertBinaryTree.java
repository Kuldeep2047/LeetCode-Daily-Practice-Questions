// Last updated: 2/16/2026, 3:37:28 PM
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
17    List<List<Integer>> ans = new ArrayList<>();
18    public List<List<Integer>> levelOrder(TreeNode root) {
19        if(root == null){
20            return ans;
21        }
22        answer(root);
23        return ans;
24    }
25
26    public void answer(TreeNode root){
27        Queue<TreeNode> q = new LinkedList<>();
28        q.add(root);
29
30        while(!q.isEmpty()){
31            int size = q.size();
32            List<Integer> ll = new ArrayList<>();
33
34            for(int i=0 ;i<size ;i++){
35                TreeNode r= q.poll();
36                ll.add(r.val);
37                if(r.left != null){
38                    q.add(r.left);
39                }
40                if(r.right != null){
41                    q.add(r.right);
42                }
43            }
44
45            ans.add(new ArrayList<>(ll));
46        }
47        
48    }
49}