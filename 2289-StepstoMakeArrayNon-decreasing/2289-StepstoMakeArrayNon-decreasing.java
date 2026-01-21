// Last updated: 1/21/2026, 9:29:54 PM
1class Solution {
2    public int totalSteps(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] nums){
6        int n = nums.length;
7        int ans = 0;
8
9        Stack<int[]> st = new Stack<>();
10
11        // push last element
12        st.push(new int[]{nums[n - 1], 0});
13
14        for (int i = n - 2; i >= 0; i--) {
15            int count = 0;
16
17            while (!st.isEmpty() && nums[i] > st.peek()[0]) {
18                count = Math.max(count + 1, st.peek()[1]);
19                st.pop();
20            }
21
22            ans = Math.max(ans, count);
23            st.push(new int[]{nums[i], count});
24        }
25
26        return ans;
27        
28    }
29}