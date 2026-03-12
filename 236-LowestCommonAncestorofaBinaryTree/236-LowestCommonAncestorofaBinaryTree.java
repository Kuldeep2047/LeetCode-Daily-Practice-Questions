// Last updated: 3/12/2026, 4:13:53 PM
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
18    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
19        ans = new ArrayList<>();
20        if(root == null){
21            return ans;
22        }
23        answer(root);
24        return ans;
25    }
26    public void answer(TreeNode root){
27        Queue<TreeNode> q = new LinkedList<>();
28        q.add(root);
29        int level = 0;
30        while(!q.isEmpty()){
31            List<Integer> ll = new ArrayList<>();
32            int size = q.size();
33        
34            for(int i=0 ;i<size ;i++){
35                TreeNode r = q.poll();
36                ll.add(r.val);
37                if(r.left != null){
38                    q.add(r.left);
39                }
40                if(r.right != null){
41                    q.add(r.right);
42                }
43            }
44
45            if(level % 2 != 0){
46                Collections.reverse(ll);
47            }
48            level++;
49            ans.add(ll);
50            
51        }
52
53    }
54}