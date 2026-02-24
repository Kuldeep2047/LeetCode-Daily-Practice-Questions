// Last updated: 2/24/2026, 12:35:28 PM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n= isConnected.length;
4        HashMap<Integer, List<Integer>> graph = new HashMap<>();
5        for(int i=1 ;i<=n ;i++){
6            graph.put(i, new ArrayList<>());
7        }
8        for(int i=0 ;i<n ;i++){
9            for(int j=0 ;j<n ;j++){
10                if(i != j && isConnected[i][j] == 1){
11                    graph.get(i+1).add(j+1);
12                    graph.get(j+1).add(i+1);
13                }
14            }
15        }
16        int c =0;
17        HashSet<Integer> visited = new HashSet<>();
18        Queue<Integer> q = new LinkedList<>(); 
19        for(int key : graph.keySet()){
20            if(visited.contains(key)){
21                continue;
22            }
23            c++;
24
25            q.add(key);
26            while(!q.isEmpty()){
27                int r = q.poll();
28
29                if(visited.contains(r)){
30                    continue;
31                }
32
33                visited.add(r);
34
35                for(int nbrs : graph.get(r)){
36                    if(!visited.contains(nbrs)){
37                        q.add(nbrs);
38                    }
39                }
40            }
41
42        }
43
44        return c;
45    }
46}