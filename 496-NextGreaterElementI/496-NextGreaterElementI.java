// Last updated: 1/20/2026, 2:53:44 PM
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
16    public int[] nextGreater(int[] arr){
17        int n = arr.length;
18        Stack<Integer> st = new Stack<>();
19        int[] nge = new int[n];
20        for(int i=n-1 ;i>=0 ;i--){
21            while(!st.isEmpty() && st.peek() < arr[i]){
22                st.pop();
23            }
24            if(st.isEmpty()){
25                nge[i] = -1;
26            }
27            else{
28                nge[i] = st.peek();
29            }
30            st.push(arr[i]);
31        }
32        return nge;
33    }
34
35    
36}