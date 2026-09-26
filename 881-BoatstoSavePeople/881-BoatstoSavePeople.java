// Last updated: 9/26/2026, 3:07:29 PM
1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        return numberOfBoats(people ,limit);
4    }
5    public static int numberOfBoats(int[] arr , int limit){
6
7        Arrays.sort(arr);
8        int boat =0;
9        int l = 0;
10        int r = arr.length-1;
11        while(l<=r){
12            if(arr[l] + arr[r] <= limit){
13                boat++;
14                l++;
15                r--;
16            }else{
17                boat++;
18                r--;
19            }
20        }
21        return boat;
22
23    }
24}