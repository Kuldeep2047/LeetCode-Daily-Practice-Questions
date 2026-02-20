// Last updated: 2/20/2026, 12:21:53 PM
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
17    int i = 0;
18    public TreeNode recoverFromPreorder(String traversal) {
19        // int i=0 ;
20        int depth = 0;
21
22        return answer(traversal, depth);
23    }
24
25    public TreeNode answer(String s ,int depth){
26        if(i >= s.length()){
27            return null;
28        }
29
30        int j = i;
31        while(j<s.length() && s.charAt(j)== '-'){
32            j++;
33        }
34
35        int desh = j-i;
36        if(desh != depth){
37            return null;
38        }
39
40        i = j;
41        int num = 0;
42        while(i<s.length() && Character.isDigit(s.charAt(i))){
43            num = num * 10 + (s.charAt(i)-'0');
44            i++;
45        }
46
47        TreeNode root = new TreeNode(num);
48        root.left = answer(s, depth+1);
49        root.right = answer(s, depth+1);
50        
51        return root;
52
53    }
54}