// Last updated: 1/12/2026, 9:54:35 PM
1class Solution {
2    public int longestBalanced(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int n = arr.length;
7        int ans =0;
8        for(int i=0 ;i<n ;i++){
9            HashSet<Integer> even = new HashSet<>();
10            HashSet<Integer> odd = new HashSet<>();
11            for(int j=i ;j<n; j++){
12                if(arr[j] % 2 == 0){
13                    even.add(arr[j]);
14                }else{
15                    odd.add(arr[j]);
16                }
17                if(even.size() == odd.size()){
18                    ans = Math.max(ans, j-i+1);
19                }
20            }
21        }
22        return ans;
23    }
24    // public boolean isAns(int[] arr, int i ,int j){
25    //     HashSet<Integer> even = new HashSet<>();
26    //     HashSet<Integer> odd = new HashSet<>();
27    //     for(int k=i ;k<=j ;k++){
28    //         if((arr[k] & 1) == 0){
29    //             even.add(arr[k]);
30    //         }else{
31    //             odd.add(arr[k]);
32    //         }
33    //     }
34        
35    //     return even.size() == odd.size();
36    // }
37}