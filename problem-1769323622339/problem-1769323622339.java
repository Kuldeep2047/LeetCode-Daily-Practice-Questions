// Last updated: 1/25/2026, 12:17:02 PM
1class Solution {
2    public int[] rotateElements(int[] nums, int k) {
3        return answer(nums, k);
4    }
5
6    public int[] answer(int[] arr, int k){
7        List<Integer> ll = new ArrayList<>();
8        int n = arr.length;
9        for(int a : arr){
10            if(a>=0){
11                ll.add(a);
12            }
13        }
14
15        int m = ll.size();
16        if(m == 0){
17            return arr;
18        }
19
20        k = k %m;
21        reverse(ll, 0, k-1);
22        reverse(ll, k, m-1);
23        reverse(ll, 0, m-1);
24
25        int c =0;
26        for(int i=0 ;i<n ;i++){
27            if(arr[i]>=0){
28                arr[i] = ll.get(c++);
29            }
30        }
31
32        return arr;
33        
34    }
35
36    public static void reverse(List<Integer> ll, int si ,int ei){
37        while(si<ei){
38            int temp = ll.get(si);
39            ll.set(si, ll.get(ei));
40            ll.set(ei, temp);
41            si++;
42            ei--;
43        }
44    }
45}
46
47
48
49