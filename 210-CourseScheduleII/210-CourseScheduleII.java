// Last updated: 2/23/2026, 4:11:19 PM
1class Solution {
2    
3    public int[] findOrder(int numCourses, int[][] prerequisites) {
4        HashMap<Integer, List<Integer>> graph = new HashMap<>();
5        for(int i=0 ;i<numCourses ; i++){
6            graph.put(i, new ArrayList<>());
7        }
8
9        for(int[] edge : prerequisites){
10            int u  =  edge[0];
11            int v = edge[1];
12            graph.get(v).add(u);
13        }
14
15        int[] in = new int[numCourses];
16
17        for(int key : graph.keySet()){
18            for(int i : graph.get(key)){
19                in[i]++;
20            }
21        }
22        List<Integer> ll = new ArrayList<>();
23        Queue<Integer> q= new LinkedList<>();
24
25        for(int i=0 ;i<numCourses ; i++){
26            if(in[i] == 0){
27                q.add(i);
28            }
29        }
30
31        while(!q.isEmpty()){
32            int r  = q.poll();
33            ll.add(r);
34
35            for(int nbrs : graph.get(r)){
36                in[nbrs]--;
37                if(in[nbrs] == 0){
38                    q.add(nbrs);
39                }
40            }
41        }
42
43        if(ll.size() < numCourses){
44            return new int[0];
45        }
46
47        int[] ans = new int[ll.size()];
48        int c = 0;
49        for(int a : ll){
50            ans[c++] = a;
51        }
52        return ans;
53
54
55    }
56}