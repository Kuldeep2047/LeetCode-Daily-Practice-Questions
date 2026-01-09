// Last updated: 1/9/2026, 11:12:02 PM
1class Solution {
2    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
3        return answer(nums ,k);
4    }
5    public boolean[] answer(int[] nums, int k){
6    
7        int n = nums.length;
8        boolean[] ans = new boolean[n];
9        Arrays.sort(nums);
10
11        boolean[] dp = new boolean[k + 1];
12        dp[0] = true;
13        int i = 0;
14
15        for(int x = 1; x <= n; x++){
16            for(; i < n && nums[i] < x; i++){
17                for(int j = k; j >= nums[i]; j--){
18                    dp[j] = dp[j] || dp[j - nums[i]];
19                }
20            }
21            
22            int ncapped = n - i;
23            for (int j = 0; j <= ncapped; j++) {
24                int times = j * x;
25                if (times > k) {
26                    break;
27                }
28                if (dp[k - times]) {
29                    ans[x - 1] = true;
30                    break;
31                }
32            }
33
34        }
35        return ans;
36    
37    }
38}