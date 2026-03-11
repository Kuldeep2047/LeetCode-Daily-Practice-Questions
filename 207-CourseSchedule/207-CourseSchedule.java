// Last updated: 3/11/2026, 4:36:44 PM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int temp = image[sr][sc];
4        answer(image, sr, sc, color, temp);
5        return image;
6    }
7    public void answer(int[][] image, int r, int c, int color, int temp){
8        if(r<0 || c<0 || r>=image.length || c>=image[0].length || image[r][c] != temp){
9            return;
10        }
11        if(temp == color){
12            return;
13        }
14        image[r][c] = color;
15
16        answer(image, r+1, c, color, temp);
17        answer(image, r, c-1, color, temp);
18        answer(image, r-1, c, color, temp);
19        answer(image, r, c+1, color, temp);
20
21
22
23    }
24}