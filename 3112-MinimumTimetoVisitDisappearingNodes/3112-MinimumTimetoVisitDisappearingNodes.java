// Last updated: 1/17/2026, 9:41:13 PM
1class Solution {
2    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
3        return answer(n, edges, disappear);
4    }
5    public int[] answer(int n, int[][] edges, int[] disappear){
6        //create graph
7        List<List<int[]>> ll = new ArrayList<>();
8        for(int i=0 ;i<n ;i++){
9            ll.add(new ArrayList<>());
10        }
11
12        for(int[] edg : edges){
13            ll.get(edg[0]).add(new int[]{edg[1], edg[2]});
14            ll.get(edg[1]).add(new int[]{edg[0], edg[2]});
15        }
16
17        int[] ans = new int[n];
18        Arrays.fill(ans, 9999999);
19        boolean[] visited = new boolean[n];
20        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1] - b[1]);
21        pq.add(new int[]{0,0});
22        ans[0] = 0;
23
24        while(!pq.isEmpty()){
25            //remove
26            int[] r= pq.poll();
27
28            //ignore if visited
29            if(visited[r[0]]){
30                continue;
31            }
32
33            // mark visited
34            visited[r[0]] = true;
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