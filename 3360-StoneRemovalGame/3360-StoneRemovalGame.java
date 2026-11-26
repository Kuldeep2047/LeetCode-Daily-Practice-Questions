// Last updated: 11/26/2026, 1:00:07 PM
1class Solution {
2    public boolean canAliceWin(int n) {
3        return answer(n);
4    }
5    public boolean answer(int n){
6        int remove = 10;
7        boolean ans = true;
8
9        while(n >= remove){
10            n -= remove;
11            remove--;
12            ans = !ans;
13        }
14
15        return !ans;
16    }
17}