// Last updated: 8/4/2026, 1:46:01 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        return answer(matrix, target);
4    }
5
6    public boolean answer(int[][] arr ,int target){
7        
8        int r =0;
9        int c = arr[0].length-1;
10        while(r< arr.length && c>=0){
11            if(arr[r][c] == target){
12                return true;
13            }else if(arr[r][c]< target){
14                r++;
15            }else{
16                c--;
17            }
18        }
19        return false;
20    }
21}