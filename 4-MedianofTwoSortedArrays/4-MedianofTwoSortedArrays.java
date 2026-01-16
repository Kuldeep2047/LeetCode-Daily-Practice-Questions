// Last updated: 1/16/2026, 9:53:09 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        return answer(nums1, nums2);
4    }
5    public double answer(int[] arr1, int[] arr2){
6        if(arr1.length > arr2.length){
7            return answer(arr2, arr1);
8        }
9        int m = arr1.length;
10        int n = arr2.length;
11        int l = 0;
12        int r = m;
13        while(l<=r){
14            int px = (l+r)/2;      //no. of elements from array 1
15            int py = (m+n+1)/2 - px;    //no. of elements from array 2
16
17            //left part
18            int x1 = px == 0 ? Integer.MIN_VALUE : arr1[px-1];
19            int x2 = py == 0 ? Integer.MIN_VALUE : arr2[py-1];
20            //right part
21            int x3 = px == m ? Integer.MAX_VALUE : arr1[px];
22            int x4 = py == n ? Integer.MAX_VALUE : arr2[py];
23
24            //check condition of sorted 
25            if(x1<=x4 && x2<=x3){
26                //if even length
27                if((m+n) % 2 == 0){
28                    return (Math.max(x1,x2) + Math.min(x3, x4))/2.0;
29                }
30                //for odd length median is
31                else{
32                    return Math.max(x1, x2);
33                }
34            }
35            else if(x1 > x4){
36                r = px-1;
37            }
38            else{
39                l = px+1;
40            }
41        }
42
43        return -1;
44    }
45}