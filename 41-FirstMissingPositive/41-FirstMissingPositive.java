// Last updated: 1/16/2026, 11:24:01 AM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        return answer(nums);
4        // return cyclic_sort(nums);
5        // return answer3(nums);
6    }
7
8    // public int answer3(int[] nums){
9    //     int n = nums.length;
10    //     for(int i=0;i<n;i++){
11    //         if(nums[i]<0 || nums[i]>n){
12    //             nums[i] = Integer.MAX_VALUE;
13    //         }
14    //     }
15    //     for(int i=0;i<n;i++){
16    //         if(nums[i] != Integer.MAX_VALUE){
17    //             int idx = nums[i]-1;
18    //             nums[idx] = -1*nums[idx];
19    //         }
20    //     }
21    //     for(int i=0;i<n;i++){
22    //         if(nums[i]>0){
23    //             return i+1; 
24    //         }
25    //     }
26    //     return n+1;
27    // }
28
29    // public int cyclic_sort(int[] nums){
30    //     int n = nums.length;
31    //     for(int i=0;i<n;i++){
32    //         while(nums[i]>0 && nums[i]<=n && nums[i] != nums[nums[i]-1]){
33    //             int idx = nums[i]-1;
34    //             int temp = nums[i];
35    //             nums[i] = nums[idx];
36    //             nums[idx] = temp;
37    //         }
38    //     }
39    //     for(int i=0;i<n;i++){
40    //         if(nums[i] != i+1){
41    //             return i+1;
42    //         }
43    //     }
44    //     return n+1;
45    // }
46
47    public int answer(int[] arr){
48        Set<Integer> set = new HashSet<>();
49        int ans = 1;
50        for(int n:arr){
51            set.add(n);
52        }
53        while(true){
54            if( ! set.contains(ans)){
55                return ans;
56
57            }
58            ans++;
59        }
60    }
61}