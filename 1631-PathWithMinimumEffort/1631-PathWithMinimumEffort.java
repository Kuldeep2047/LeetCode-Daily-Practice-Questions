// Last updated: 3/17/2026, 11:38:19 AM
1class Solution {
2    public int minimumEffortPath(int[][] heights) {
3        
4        return answer(heights);
5    }
6    public int answer(int[][] arr){
7        int n = arr.length;
8        int m = arr[0].length;
9
10        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);    //effort, row, col
11        int[][] dis= new int[n][m];
12        for(int[] row : dis){
13            Arrays.fill(row, Integer.MAX_VALUE);
14        }
15
16        pq.offer(new int[]{0,0,0});
17
18        int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};
19
20        while(!pq.isEmpty()){
21            int[] remove = pq.poll();
22            int effort = remove[0];
23            int r = remove[1];
24            int c = remove[2];
25
26            if(r == n-1 && c == m-1){
27                return effort;
28            }
29
30            for(int[] d : dir){
31                int nr = d[0] + r;
32                int nc = d[1] + c;
33
34                if(nr >=0 && nc >=0 && nr <n && nc <m ){
35                    int newEffort = Math.max(effort, Math.abs(arr[r][c] - arr[nr][nc]));
36
37                    if(newEffort < dis[nr][nc]){
38                        dis[nr][nc] = newEffort;
39                        pq.add(new int[]{newEffort, nr, nc});
40                    }
41                }
42            }
43        }
44        return 0;
45
46
47    }
48}