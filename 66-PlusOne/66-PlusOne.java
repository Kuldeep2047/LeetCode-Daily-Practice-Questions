// Last updated: 4/6/2026, 2:32:25 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        return Plus_One(digits);
4    }
5
6    
7    public int[] Plus_One(int[] digits){
8        int n = digits.length;
9        int[] nums = new int[n+1];
10        for(int i=n-1;i>=0;i--){
11            if(digits[i]<9){
12                digits[i]++;
13                return digits;
14            }
15            digits[i] = 0;
16        }
17
18        nums[0] =1;
19        return nums;
20    }
21}