// Last updated: 4/11/2026, 10:18:26 PM
1class Solution {
2    public int minimumDistance(int[] nums) {
3        return answer(nums);
4    }
5    public static int answer(int[] arr){
6        int n = arr.length;
7        HashMap<Integer, List<Integer>> map = new HashMap<>();
8
9        int ans = Integer.MAX_VALUE;
10
11        for(int i=0 ;i<n ;i++){
12            if( ! map.containsKey(arr[i])){
13                map.put(arr[i], new ArrayList<>());
14            }
15            map.get(arr[i]).add(i);
16        }
17
18        for(List<Integer> ll : map.values()){
19
20            if(ll.size()>=3){
21                for(int i=0 ;i+2 < ll.size() ;i++){
22                    int d = 2 * (ll.get(i+2) - ll.get(i));
23
24                    ans = Math.min(ans, d);
25                }
26            }
27        }
28
29        if(ans == Integer.MAX_VALUE){
30            return -1;
31        }else{
32            return ans;
33        }
34
35    }
36}