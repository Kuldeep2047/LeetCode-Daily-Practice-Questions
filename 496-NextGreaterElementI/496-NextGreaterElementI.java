// Last updated: 1/20/2026, 2:47:19 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int[] nge = nextGreater(nums2);
4        Map<Integer, Integer> map = new HashMap<>();
5        for(int i=0;i< nums2.length ;i++){
6            map.put(nums2[i], nge[i]);
7        }
8        int[] ans = new int[nums1.length];
9        for(int i=0;i<nums1.length ;i++){
10            ans[i] = map.get(nums1[i]);
11        }
12        return ans;
13        
14    }
15
16    public int[] nextGreater(int[] nums2){
17        int n2 = nums2.length;
18        int[] nge = new int[n2];
19        Stack<Integer> st = new Stack<>();
20        for(int i=n2-1; i>=0; i--) {
21            while(!st.isEmpty() && st.peek() <= nums2[i]) {
22                st.pop();
23            }
24            if(st.isEmpty()) nge[i] = -1;
25            else nge[i] = st.peek();
26            st.push(nums2[i]);
27        }
28        return nge;
29    }
30}