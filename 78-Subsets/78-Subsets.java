// Last updated: 7/28/2026, 11:16:19 AM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> ll = new ArrayList<>();
5        Sub_Sets(nums, 0, ll, ans);
6        return ans;
7    }
8    public static void Sub_Sets(int[] nums , int idx, List<Integer> ll, List<List<Integer>> ans){
9        
10        ans.add(new ArrayList<>(ll)); 
11        
12        for(int i = idx ;i<nums.length ;i++){
13            ll.add(nums[i]);
14            Sub_Sets(nums, i+1, ll, ans);
15            ll.remove(ll.size()-1);
16        }
17
18
19
20    }
21
22    // public static void Sub_Sets(int[] nums , int idx, List<Integer> ll, List<List<Integer>> ans){
23    //     if(idx == nums.length){
24    //         ans.add(new ArrayList<>(ll));
25    //         return;
26    //     }
27
28    //     ll.add(nums[idx]);
29    //     Sub_Sets(nums, idx+1, ll, ans);
30    //     ll.remove(ll.size()-1);
31    //     Sub_Sets(nums, idx+1, ll, ans);
32
33
34
35    // }
36}