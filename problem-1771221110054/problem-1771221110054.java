// Last updated: 2/16/2026, 11:21:50 AM
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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        List<Integer> ll = new ArrayList<>();
19        // postorder(root,ll);
20
21        if(root == null){
22            return ll;
23        }
24
25        Stack<TreeNode> st = new Stack<>();
26        // TreeNode curr = root;
27
28        st.push(root);
29
30        while(!st.isEmpty()){
31            TreeNode r = st.pop();
32            ll.add(r.val);
33
34            if(r.left != null){
35                st.push(r.left);
36            }
37            if(r.right != null){
38                st.push(r.right);
39            }
40        }
41        Collections.reverse(ll);
42
43        // for(int a : ll){
44        //     System.out.print(a + " ");
45        // }
46
47        return ll;
48
49
50        
51    }
52    public void postorder(TreeNode root, List<Integer> ll){
53        if(root == null){
54            return ;
55        }
56        postorder(root.left,ll);
57        postorder(root.right,ll);
58        ll.add(root.val);
59    }
60}