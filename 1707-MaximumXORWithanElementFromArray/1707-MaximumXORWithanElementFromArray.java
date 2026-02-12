// Last updated: 2/12/2026, 12:11:23 PM
1class Solution {
2    public int[] maximizeXor(int[] arr, int[][] queries) {
3        int[][] q= new int[queries.length][3];
4		for(int i=0 ; i<q.length ;i++) {
5			q[i][0] = queries[i][0]; //Xi
6			q[i][1] = queries[i][1];	//m
7			q[i][2] = i; 	//idx
8		}
9		
10		Arrays.sort(q, (a,b) -> a[1] - b[1]);
11		Arrays.sort(arr);
12		int[] ans = new int[queries.length];
13		Trie t= new Trie();
14		int j = 0; //index
15		for(int [] a :q) {
16			while(j<arr.length && arr[j]<=a[1]) {
17				t.add(arr[j]);
18				j++;
19			}
20			if(j == 0) {
21				ans[a[2]] = -1;
22			}else {
23				ans[a[2]] = t.getMaxXor(a[0]);
24			}
25		}
26		return ans;
27    }
28
29    static class Trie{
30		class Node{
31			Node zero;
32			Node one;
33		}
34		private Node root = new Node();
35		
36		public void add(int val) {
37			Node curr = root;
38			for(int i=31 ;i>=0 ;i--) {
39				int bit = val & (1 << i);
40				if(bit == 0) {
41					if(curr.zero != null) {
42						curr = curr.zero;
43					}else {
44						Node nn = new Node();
45						curr.zero = nn;
46						curr = nn;
47					}
48				}else {
49					if(curr.one != null) {
50						curr = curr.one;
51					}else {
52						Node nn = new Node();
53						curr.one = nn;
54						curr = nn;
55					}
56					
57				}
58			}
59		}
60		
61		public int getMaxXor(int x) {
62			int ans = 0;
63			Node curr = root;
64			for(int i = 31 ;i>=0 ;i--) {
65				int bit = x & (1 << i);
66				if(bit == 0) {
67					if(curr.one !=  null) {
68						ans = ans | (1 << i);
69						curr = curr.one;
70					}else {
71						curr = curr.zero;
72					}
73				}else {
74					if(curr.zero !=  null) {
75						ans = ans | (1 << i);
76						curr = curr.zero;
77					}else {
78						curr = curr.one;
79					}
80				}
81			}
82			return ans;
83		}
84		
85	}
86}