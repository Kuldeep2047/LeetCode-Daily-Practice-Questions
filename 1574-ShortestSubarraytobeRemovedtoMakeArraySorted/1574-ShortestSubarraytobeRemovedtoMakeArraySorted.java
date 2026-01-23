// Last updated: 1/23/2026, 12:10:40 PM
1class Solution {
2    public int findLengthOfShortestSubarray(int[] arr) {
3        return answer(arr);
4    }
5
6    public int answer(int[] arr){
7        int n = arr.length;
8
9        int left =0;
10        int right = n-1;
11        while(left+1 < n && arr[left]<=arr[left + 1]){
12            left++;
13        }
14        if(left == n-1){
15            return 0;   //no need for sorting
16        }
17
18        while(right-1 >=0 && arr[right-1] <= arr[right]){
19            right--;
20        }
21
22        int ans = Math.min(n-left -1, right);
23
24        int i = 0, j = right;
25        while (i <= left && j < n) {
26            if (arr[i] <= arr[j]) {
27                
28                ans = Math.min(ans, j - i - 1);
29                i++;
30            } else {
31                j++;
32            }
33        }
34
35        return ans;
36
37    }
38}