// Last updated: 2/16/2026, 12:15:40 PM
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
18    public int maxDepth(TreeNode root) {
19        // answer(root, 1);
20        // return ans;
21
22        return answer2(root);
23    }
24
25    public int answer2(TreeNode root){
26        Queue<TreeNode> q= new LinkedList<>();
27        q.add(root);
28        int ans =0;
29        if(root == null){
30            return ans;
31        }
32
33        while(!q.isEmpty()){
34            
35            int size = q.size();
36            ans++;
37
38            for(int i=0 ;i<size ;i++){
39                TreeNode r = q.poll();
40                if(r.left != null){
41                    q.add(r.left);
42                }
43                if(r.right != null){
44                    q.add(r.right);
45                }
46            }
47        }
48
49        return ans;
50    }
51
52    public void answer(TreeNode root, int c){
53        if(root == null){
54            return;
55        }
56        if(c >= ans){
57            ans = c;
58        }
59
60        answer(root.left, c+1);
61        answer(root.right, c+1);
62    }
63}