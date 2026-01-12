// Last updated: 1/12/2026, 6:50:09 PM
1class Solution {
2    public int centeredSubarrays(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int n = arr.length;
7        int ans =0;
8        for(int i=0 ;i<n ;i++){
9            for(int j=i ;j<n ;j++){
10                if(isCentered(arr, i, j)){
11                    ans++;
12                }
13            }
14        }
15        return ans;
16    }
17    public boolean isCentered(int[] arr, int i ,int j){
18        int sum =0;
19        for(int k=i ;k<=j ;k++){
20            sum += arr[k];
21        }
22        for(int k=i ;k<=j ;k++){
23            if(arr[k] == sum){
24                return true;
25            }
26        }
27        return false;
28    }
29}