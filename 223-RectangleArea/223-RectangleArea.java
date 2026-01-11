// Last updated: 1/11/2026, 1:49:36 PM
1class Solution {
2    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
3        int area1 = (ax1 - ax2) * (ay1 - ay2);
4        int area2 = (bx1 - bx2) * (by1 - by2);
5        
6        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
7        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
8
9        int overlapArea = 0;
10        if(overlapWidth>0 && overlapHeight>0)
11            overlapArea = overlapHeight * overlapWidth;
12
13
14        return area1+area2 - overlapArea;
15    }
16}