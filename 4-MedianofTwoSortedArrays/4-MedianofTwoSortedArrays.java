// Last updated: 1/13/2026, 4:06:12 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        return answer(nums1,nums2);
4    }
5    public static double answer(int[] a, int [] b){
6        int n = a.length;
7        int m = b.length;
8        int[] arr = new int[n+m];
9        int c=0;
10        for(int i=0 ;i<n ;i++){
11            arr[c++] = a[i];
12        }
13        for(int i=0 ;i<m ;i++){
14            arr[c++] = b[i];
15        }
16        Arrays.sort(arr);
17        int l = arr.length;
18        if(l % 2 != 0){
19            return arr[l/2];
20        }else{
21            return (arr[l/2-1]+ arr[l/2])/2.0;
22        }
23
24    }
25}