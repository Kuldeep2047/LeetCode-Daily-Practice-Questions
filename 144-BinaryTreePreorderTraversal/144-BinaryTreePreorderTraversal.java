// Last updated: 2/16/2026, 11:07:10 AM
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> ll = new ArrayList<>();
19        // preorder(root,ll);
20        // return ll;
21
22        if(root == null){
23            return ll;
24        }
25
26        Stack<TreeNode> st = new Stack<>();
27        TreeNode curr = root;
28
29        st.push(root);
30
31        while(!st.isEmpty()){
32            TreeNode r = st.pop();
33            ll.add(r.val);
34            if(r.right != null){
35                st.push(r.right);
36            }
37
38            if(r.left != null){
39                st.push(r.left);
40            }
41            
42        }
43
44        for(int a : ll){
45            System.out.print(a + " ");
46        }
47
48        return ll;
49        
50    }
51    public void preorder(TreeNode root,List<Integer> ll){
52        if(root == null){
53            return;
54        }
55        ll.add(root.val);
56        preorder(root.left,ll);
57        preorder(root.right,ll);
58    }
59}