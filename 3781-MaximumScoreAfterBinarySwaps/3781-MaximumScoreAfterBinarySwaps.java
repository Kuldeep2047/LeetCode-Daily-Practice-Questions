// Last updated: 1/15/2026, 12:12:02 AM
1class Solution {
2    public long maximumScore(int[] nums, String s) {
3        return answer(nums, s);
4        
5    }
6    public long answer(int[] arr, String s){
7        int n = arr.length;
8        // int m = s.length();
9        long ans = 0;
10        
11        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
12
13        for(int i=0 ;i<n ;i++){
14            pq.add(arr[i]);
15
16            char ch = s.charAt(i);
17            if(ch == '1'){
18                ans += pq.poll();
19            }
20        }
21
22        return ans;
23
24        
25        
26    }
27}