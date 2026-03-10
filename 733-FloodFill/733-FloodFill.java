// Last updated: 3/10/2026, 11:04:10 AM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int temp = image[sr][sc];
4        if(temp == color){
5            return image;
6        }
7        answer(image, sr ,sc, color, temp);
8        return image;
9    }
10
11    public void answer(int[][] image, int r, int c, int color, int temp){
12        if(r<0 || c<0 || r>=image.length || c>=image[0].length || image[r][c] != temp){
13            return;
14        }
15
16        image[r][c] = color;
17        answer(image, r+1, c, color, temp);
18        answer(image, r, c-1, color, temp);
19        answer(image, r-1, c, color, temp);
20        answer(image, r, c+1, color, temp);
21    }
22}