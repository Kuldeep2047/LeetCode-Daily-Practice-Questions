// Last updated: 3/9/2026, 3:25:49 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        // return answer(nums);
4        return Longest_Consecutive(nums);
5    }
6    public static int Longest_Consecutive(int[] arr) {
7		HashSet<Integer> set = new HashSet<>();
8		for(int i=0;i<arr.length;i++) {
9			set.add(arr[i]);
10		}
11		int ans =0;
12		for(int i=0;i<arr.length;i++) {
13			if(! set.contains(arr[i]-1)) {
14				int c=0;
15				int key = arr[i];
16				while(set.contains(key)) {
17					set.remove(key);
18					c++;
19					key++;
20				}
21				ans = Math.max(ans, c);
22			}
23		}
24		return ans;	
25	}
26    // public static int answer(int[] arr){
27    //     int ans =0;
28    //     Set<Integer> set = new HashSet<>();
29    //     for(int n:arr){
30    //         set.add(n);
31    //     }
32
33    //     for(int n:set){
34    //         if(!set.contains(n-1)){
35    //             // int start = n;
36    //             int len =1;
37    //             while(set.contains(n+1)){
38    //                 len++;
39    //                 n++;
40    //             }
41
42    //             ans = Math.max(ans,len);
43    //         }
44    //     }
45    //     return ans;
46    // }
47}