// Last updated: 2/4/2026, 10:36:11 PM
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
20        boolean[] visited = new boolean[n];
21        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1] - b[1]);
22        pq.add(new int[]{0,0});
23        ans[0] = 0;
24
25        while(!pq.isEmpty()){
26            //remove
27            int[] r= pq.poll();
28
29            //ignore if visited
30            if(visited[r[0]]){
31                continue;
32            }
33
34            // mark visited
35            visited[r[0]] = true;
36
37            //add nbrs
38            for(int[] nbrs : ll.get(r[0])){
39                int dis = r[1] + nbrs[1];
40                if(dis< disappear[nbrs[0]] && dis < ans[nbrs[0]]){
41                    ans[nbrs[0]] = dis;
42                    pq.add(new int[]{nbrs[0], dis});
43                }
44            }
45        }
46
47        for(int i=0 ;i<n ;i++){
48            if(ans[i] == 9999999){
49                ans[i] = -1;
50            }
51        }
52
53        return ans;
54    }
55}