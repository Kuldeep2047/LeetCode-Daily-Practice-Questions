// Last updated: 1/14/2026, 8:32:40 PM
1class Solution {
2    class Node {
3		int val;
4		int rank;
5		Node parent;
6	}
7
8	HashMap<Integer, Node> map = new HashMap<>();
9
10	public void create(int v) {
11		Node nn = new Node();
12		nn.val = v;
13		nn.rank = 0;
14		nn.parent = nn;
15		map.put(v, nn);
16
17	}
18
19	public int find(int v) {
20		Node node = map.get(v);
21		return find(node).val;
22
23	}
24
25	private Node find(Node node) {
26		if (node.parent == node) {
27			return node;
28		}
29		Node n = find(node.parent);
30		node.parent = n;// path Compression
31		return n;
32
33	}
34
35	public void union(int v1, int v2) {
36		Node node1 = map.get(v1);
37		Node node2 = map.get(v2);
38		Node re1 = find(node1);
39		Node re2 = find(node2);
40		if (re1.rank == re2.rank) {
41			re1.parent = re2;
42			re2.rank++;
43		} else if (re1.rank < re2.rank) {
44			re1.parent = re2;
45		} else {
46			re2.parent = re1;
47		}
48	}
49    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
50        for(int i=0 ;i<n ;i++){
51            create(i);
52        }
53
54        for(int i=1 ;i<nums.length ;i++){
55            if(nums[i] - nums[i-1] <= maxDiff){
56                union(i, i-1);
57            }
58        }
59        boolean[] ans = new boolean[queries.length];
60        int idx =0;
61
62        for(int i=0 ;i<queries.length ;i++){
63            int start = queries[i][0];
64            int end = queries[i][1];
65
66            if(find(start) == find(end)){
67                ans[idx++] = true;
68            }else{
69                ans[idx++] = false;
70            }
71        }
72
73        return ans;
74    }
75}