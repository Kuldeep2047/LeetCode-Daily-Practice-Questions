// Last updated: 3/24/2026, 11:59:27 AM
1class Solution {
2    Map<Integer, List<Integer>> map = new HashMap<>();
3    int[] ans;
4    int[] count; 
5    public int[] sumOfDistancesInTree(int n, int[][] edges) {
6        ans = new int[n];
7        count = new int[n];
8
9        for(int i=0 ;i<n ;i++){
10            map.put(i, new ArrayList<>());
11        }
12        for(int[] edge : edges){
13            int u = edge[0];
14            int v = edge[1];
15            map.get(u).add(v);
16            map.get(v).add(u);
17        }
18
19        //first find the initial answer of root and calculate subtree sizes
20        dfs(0, -1);
21        // Use ans[0] to find all answer of all nodes
22        dfs2(0, -1);
23
24        return ans;
25
26    }
27
28    public void dfs(int node, int parent){
29        count[node] =1;
30
31        for(int nbrs : map.get(node)){
32            if(nbrs != parent){
33                dfs(nbrs, node);
34
35                count[node] += count[nbrs];
36                ans[node] += ans[nbrs] + count[nbrs]; 
37            }
38        }
39    }
40
41    public void dfs2(int node,  int parent){
42
43        for(int child : map.get(node)){
44            if(child != parent){
45                
46                // ans[child] = ans[parent] - count[child] + (n - count[child]);
47                ans[child] = ans[node] - count[child] + (count.length - count[child]);
48
49                dfs2(child, node);
50            }
51        }
52    }
53}