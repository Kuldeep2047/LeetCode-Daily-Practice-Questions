// Last updated: 1/11/2026, 11:23:57 PM
1class Solution {
2    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
3        int[] diff = new int[100001];
4        int max =0;
5        long total=0;
6        for(int i=0; i<nums1.length; i++) {
7            int d = Math.abs(nums1[i]-nums2[i]);
8            total+=d;
9            diff[d]++;
10            max = Math.max(max, d);
11        }
12        long ans = 0;
13        int k = k1+k2;
14        if(total<=k) return ans;
15        for(int i=max; i>0 && k>0; i--) {
16            if(diff[i]<k) {
17                diff[i-1] = diff[i-1] + diff[i];
18                k -= diff[i];
19                diff[i] = 0;
20            } else {
21                diff[i-1] = diff[i-1] + k;
22                diff[i] -= k;
23                k = 0;
24            }
25        }
26
27        for(int i=max; i>0; i--) {
28            ans += diff[i] * (long)i*i;
29        }
30        return ans;
31        
32    }
33}