// Last updated: 3/17/2026, 12:11:26 PM
1class Solution {
2    public int shortestPath(int[][] grid, int k) {
3        int n = grid.length;
4        int m = grid[0].length;
5
6       
7        boolean[][][] visited = new boolean[n][m][k + 1];
8
9        Queue<int[]> q = new LinkedList<>();
10        q.offer(new int[]{0, 0, k, 0});     // row, col, rem k, steps
11
12        visited[0][0][k] = true;
13
14        int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};
15
16        while (!q.isEmpty()) {
17            int[] curr = q.poll();
18
19            int r = curr[0];
20            int c = curr[1];
21            int rem = curr[2];
22            int steps = curr[3];
23
24           
25            if (r == n - 1 && c == m - 1) {
26                return steps;
27            }
28
29            for (int[] d : dir) {
30                int nr = r + d[0];
31                int nc = c + d[1];
32
33                if(nr >= 0 && nc >= 0 && nr < n && nc < m){
34
35                    // ager obstacle aa jaye
36                    if(grid[nr][nc] == 1){
37                        if(rem > 0 && !visited[nr][nc][rem - 1]){
38                            visited[nr][nc][rem - 1] = true;
39                            q.offer(new int[]{nr, nc, rem - 1, steps + 1});
40                        }
41                    }
42                    else{
43                        if(!visited[nr][nc][rem]){
44
45                            visited[nr][nc][rem] = true;
46
47                            q.offer(new int[]{nr, nc, rem, steps + 1});
48                        }
49                    }
50                }
51            }
52        }
53
54        return -1; 
55    }
56}