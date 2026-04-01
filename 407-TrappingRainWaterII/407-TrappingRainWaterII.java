// Last updated: 4/1/2026, 11:06:25 AM
1class Solution {
2    public int trapRainWater(int[][] heightMap) {
3        return answer(heightMap);
4    }
5    public int answer(int[][] arr){
6        int n = arr.length;
7        int m = arr[0].length;
8
9        boolean[][] visited = new boolean[n][m];
10        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0] - b[0]);
11
12        for(int i=0 ;i<m ;i++){
13            pq.add(new int[]{arr[0][i], 0, i});
14            pq.add(new int[]{arr[n-1][i], n-1, i});
15            visited[0][i] = true;
16            visited[n-1][i] = true;
17        }
18
19        for(int i=0 ;i<n ;i++){
20            pq.add(new int[]{arr[i][0], i, 0});
21            pq.add(new int[]{arr[i][m-1], i, m-1});
22            visited[i][0] = true;
23            visited[i][m-1] = true;
24        }
25        
26        int[][] dir = {{1,0}, {-1,0}, {0,-1} ,{0,1}};
27        int ans =0;
28        while(!pq.isEmpty()){
29            int[] remove = pq.poll();
30            int h = remove[0];
31            int r = remove[1];
32            int c = remove[2];
33
34            for(int i=0 ;i<4 ;i++){
35                int nr = r + dir[i][0];
36                int nc = c + dir[i][1];
37
38                if(nr >=0 && nc >=0 && nr<n && nc < m && !visited[nr][nc]){
39                    
40                    if(h - arr[nr][nc] >= 0){
41                        ans += (h - arr[nr][nc]);
42                    }
43                    
44                    visited[nr][nc] = true;
45                    pq.add(new int[]{Math.max(h, arr[nr][nc]), nr, nc});
46                }
47            }
48        }
49
50        return ans;
51
52    }
53}