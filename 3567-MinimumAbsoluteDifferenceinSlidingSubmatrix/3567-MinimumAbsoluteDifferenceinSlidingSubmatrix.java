// Last updated: 3/20/2026, 10:34:52 PM
1class Solution {
2    public int[][] minAbsDiff(int[][] grid, int k) {
3        return answer(grid,k);
4    }
5    public static int[][] answer(int[][] mat,int window){
6        int rows = mat.length;
7        int cols = mat[0].length;
8        int[][] result = new int[rows-window+1][cols-window+1];
9
10        for(int r =0;r<=rows-window;r++){
11            for(int c =0;c<=cols-window;c++){
12                int[] block = new int[window*window];
13                int idx =0;
14                for(int i=r;i<r+window;i++){
15                    for(int j = c;j<c+window;j++){
16                        block[idx++] = mat[i][j];
17                    }
18                }
19                Arrays.sort(block,0,idx);
20                int min = Integer.MAX_VALUE;
21
22                for(int i=1;i<idx;i++){
23                    if(block[i] != block[i-1]){
24                        min = Math.min(min,block[i]-block[i-1]);
25                    }
26                }
27                result[r][c] = (min==Integer.MAX_VALUE) ? 0 : min;
28            }
29        }
30        return result;
31    }
32}