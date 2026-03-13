// Last updated: 3/13/2026, 12:27:22 PM
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
17    public TreeNode deleteNode(TreeNode root, int key) {
18        if(root == null){
19            return null;
20        }
21        if(key < root.val){
22            root.left = deleteNode(root.left, key);
23        }
24        else if(key > root.val){
25            root.right = deleteNode(root.right, key);
26        }else{
27            if(root.left == null){
28                return root.right;
29            }
30            if(root.right == null){
31                return root.left;
32            }
33            // node has two children
34
35            // Find inorder successor
36            TreeNode successor = findMin(root.right);
37
38            // Replace root value with successor value
39            root.val = successor.val;
40
41            // Delete successor node
42            root.right = deleteNode(root.right, successor.val);
43        }
44        return root;
45    }
46    public TreeNode findMin(TreeNode node) {
47
48        // Traverse left until we reach smallest node
49        while (node.left != null) {
50            node = node.left;
51        }
52
53        return node;
54    }
55}