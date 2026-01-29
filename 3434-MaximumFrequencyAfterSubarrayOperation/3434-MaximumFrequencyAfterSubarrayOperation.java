// Last updated: 1/29/2026, 11:57:17 PM
1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        return Max_Operation(nums,k);
4    }
5    public static int Max_Operation(int[] nums,int k){
6        int kCount = 0;
7        for(int a : nums){
8            if(a == k){
9                kCount++;
10            }
11        }
12
13        int ans = kCount;
14        for(int val =-50 ;val<=50 ;val++){
15            if(val == 0){
16                continue;
17            }
18            int max = 0;
19            int curr =0;
20            for(int num : nums){
21                if(num + val == k){
22                    curr++;
23                }
24                else if(num == k){
25                    curr--;
26                }
27                if(curr < 0){
28                    curr =0;
29                }
30                max = Math.max(max, curr);
31            }
32            ans = Math.max(ans, max + kCount);
33        }
34        return ans;
35    }
36}