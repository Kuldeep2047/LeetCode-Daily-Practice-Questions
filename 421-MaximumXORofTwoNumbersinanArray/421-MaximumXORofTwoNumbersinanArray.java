// Last updated: 2/11/2026, 12:43:11 PM
1class Solution {
2
3    public int findMaximumXOR(int[] arr) {
4        Trie t = new Trie();
5		for(int x :arr) {
6			t.add(x);
7		}
8		int ans =0;
9		for(int x : arr) {
10			ans = Math.max(ans,  t.getMaxXor(x));
11		}
12		return ans;
13    }
14    
15    static class Trie{
16		class Node{
17			Node zero;
18			Node one;
19		}
20		private Node root = new Node();
21		
22		public void add(int val) {
23			Node curr = root;
24			for(int i=31 ;i>=0 ;i--) {
25				int bit = val & (1 << i);
26				if(bit == 0) {
27					if(curr.zero != null) {
28						curr = curr.zero;
29					}else {
30						Node nn = new Node();
31						curr.zero = nn;
32						curr = nn;
33					}
34				}else {
35					if(curr.one != null) {
36						curr = curr.one;
37					}else {
38						Node nn = new Node();
39						curr.one = nn;
40						curr = nn;
41					}
42					
43				}
44			}
45		}
46		
47		public int getMaxXor(int x) {
48			int ans = 0;
49			Node curr = root;
50			for(int i = 31 ;i>=0 ;i--) {
51				int bit = x & (1 << i);
52				if(bit == 0) {
53					if(curr.one !=  null) {
54						ans = ans | (1 << i);
55						curr = curr.one;
56					}else {
57						curr = curr.zero;
58					}
59				}else {
60					if(curr.zero !=  null) {
61						ans = ans | (1 << i);
62						curr = curr.zero;
63					}else {
64						curr = curr.one;
65					}
66				}
67			}
68			return ans;
69		}
70		
71	}
72    
73}