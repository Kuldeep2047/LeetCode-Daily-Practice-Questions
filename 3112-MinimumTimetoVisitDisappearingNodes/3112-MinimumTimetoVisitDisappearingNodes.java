// Last updated: 2/26/2026, 11:22:47 AM
1class Solution {
2    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
3        return answer(n, edges, disappear);
4    }
5    
6    public int[] answer(int n, int[][] edges, int[] disappear){
7        //create graph
8        List<List<int[]>> ll = new ArrayList<>();
9        for(int i=0 ;i<n ;i++){
10            ll.add(new ArrayList<>());
11        }
12
13        for(int[] edg : edges){
14            ll.get(edg[0]).add(new int[]{edg[1], edg[2]});
15            ll.get(edg[1]).add(new int[]{edg[0], edg[2]});
16        }
17
18        int[] ans = new int[n];
19        Arrays.fill(ans, 9999999);
20        // boolean[] visited = new boolean[n];
21        HashSet<Integer> visited = new HashSet<>();
22        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1] - b[1]);
23        pq.add(new int[]{0,0});
24        ans[0] = 0;
25
26        while(!pq.isEmpty()){
27            //remove
28            int[] r= pq.poll();
29
30            if(visited.contains(r[0])){
31                continue;
32            }
33
34            visited.add(r[0]);
35
36            //add nbrs
37            for(int[] nbrs : ll.get(r[0])){
38                int dis = r[1] + nbrs[1];
39                if(dis< disappear[nbrs[0]] && dis < ans[nbrs[0]]){
40                    ans[nbrs[0]] = dis;
41                    pq.add(new int[]{nbrs[0], dis});
42                }
43            }
44        }
45
46        for(int i=0 ;i<n ;i++){
47            if(ans[i] == 9999999){
48                ans[i] = -1;
49            }
50        }
51
52        return ans;
53    }
54}