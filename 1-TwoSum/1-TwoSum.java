// Last updated: 3/11/2026, 10:28:45 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        return answer(nums, target);
4    }
5
6    public int[] answer(int[] arr ,int tar){
7        int n = arr.length;
8        HashMap<Integer, Integer> map = new HashMap<>();
9
10        int[] ans = {-1, -1};
11        for(int i=0 ;i<n ;i++){
12            if(map.containsKey(tar - arr[i])){
13                ans[0] = map.get(tar - arr[i]);
14                ans[1] = i;
15                break;
16            }
17            map.put(arr[i], i);
18        }
19        return ans;
20    }
21}