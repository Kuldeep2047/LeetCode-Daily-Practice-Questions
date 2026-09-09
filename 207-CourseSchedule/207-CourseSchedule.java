// Last updated: 9/9/2026, 2:52:26 PM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        return topological_sort(numCourses, prerequisites);
4    }
5
6    public boolean topological_sort(int V, int[][] edges){
7        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
8        
9        for(int i=0 ;i<V ;i++){
10            map.put(i, new ArrayList<>());
11        }
12        
13        for(int i=0 ;i<edges.length ;i++){
14            map.get(edges[i][0]).add(edges[i][1]);
15        }  
16        
17        //get indegree
18        int[] in = new int[V];
19        
20        for(int key : map.keySet()){
21            for(int i : map.get(key)){
22                in[i]++;
23            }
24        }
25        
26        Queue<Integer> q= new LinkedList<>();
27        ArrayList<Integer> ll = new ArrayList<>();
28        
29        for(int i=0 ;i<in.length ;i++){
30            if(in[i] == 0){
31                q.add(i);
32            }
33        }
34        
35        while(!q.isEmpty()){
36            int r = q.poll();
37            
38            ll.add(r);
39            for(int nbrs : map.get(r)){
40                in[nbrs]--;
41                
42                if(in[nbrs] == 0){
43                    q.add(nbrs);
44                }
45            }
46        }
47        
48        return ll.size() == V;
49    }
50}