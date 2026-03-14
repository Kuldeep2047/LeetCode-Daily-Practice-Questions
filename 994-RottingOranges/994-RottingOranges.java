// Last updated: 3/14/2026, 11:21:28 AM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        return answer(grid);
4    }
5    public int answer(int[][] grid){
6        int n = grid.length;
7        int m = grid[0].length;
8        int fresh= 0;
9
10        Queue<int[]> q = new LinkedList<>();
11        for(int i=0 ;i<n ;i++){
12            for(int j=0 ;j<m ;j++){
13                if(grid[i][j] == 2){
14                    q.add(new int[]{i, j});
15                }else if(grid[i][j] == 1){
16                    fresh++;
17                }
18            }
19        }
20        if(fresh == 0){
21            return 0;
22        }
23        
24        int time =0;
25        int[][] dir = {{0,-1},{0,1},{1,0},{-1, 0}};
26        // apply bfs
27        while(!q.isEmpty()){
28            int size = q.size();
29            for(int i=0 ;i<size ;i++){
30                int[] r = q.poll();
31                for(int d=0 ;d<4 ;d++){
32                    int cr = r[0] + dir[d][0];
33                    int cc = r[1] + dir[d][1];
34
35                    if(cr >=0 && cc>=0 && cr<n && cc<m && grid[cr][cc] == 1){
36                        fresh--;
37                        grid[cr][cc] = 2;
38                        q.add(new int[]{cr, cc}); //add new rotten orange to queue
39                    }
40                }
41            }
42            time++;
43        }
44
45        if(fresh == 0){
46            return time-1;
47        }
48        return -1;
49    }
50}