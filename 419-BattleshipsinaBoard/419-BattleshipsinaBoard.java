// Last updated: 3/15/2026, 6:13:34 PM
1class Solution {
2    public int countBattleships(char[][] board) {
3        return answer(board);
4    }
5    public int answer(char[][] board){
6        int n = board.length;
7        int m = board[0].length;
8
9        int ans =0;
10
11        for(int i=0 ;i<n ;i++){
12            for(int j=0 ;j<m ;j++){
13                if(board[i][j] == 'X'){
14                    if((i == 0 || board[i-1][j] != 'X') && (j==0 || board[i][j-1] != 'X')){
15                        ans++;
16                    }
17                }
18            }
19        }
20        return ans;
21    }
22}