// Last updated: 8/4/2026, 2:02:13 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        return answer(matrix , target);
4    }
5    public boolean answer(int[][] arr ,int target){
6        int r = 0;
7        int c = arr[0].length-1;
8
9        while(r< arr.length && c>=0){
10            if(arr[r][c] == target){
11                return true;
12            }
13            if(arr[r][c] < target){
14                r++;
15            }else{
16                c--;
17            }
18        }
19        return false;
20    }
21}