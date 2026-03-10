// Last updated: 3/10/2026, 11:05:54 AM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int temp = image[sr][sc];
4        
5        answer(image, sr ,sc, color, temp);
6        return image;
7    }
8
9    public void answer(int[][] image, int r, int c, int color, int temp){
10        if(r<0 || c<0 || r>=image.length || c>=image[0].length || image[r][c] != temp){
11            return;
12        }
13        if(temp == color){
14            return ;
15        }
16
17        image[r][c] = color;
18        answer(image, r+1, c, color, temp);
19        answer(image, r, c-1, color, temp);
20        answer(image, r-1, c, color, temp);
21        answer(image, r, c+1, color, temp);
22    }
23}