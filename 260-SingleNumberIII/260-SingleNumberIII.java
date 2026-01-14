// Last updated: 1/14/2026, 12:45:24 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        return Single_Number(nums);
4    }
5    public static int[] Single_Number(int[] arr) {
6		int xor = 0;
7		for(int i=0 ;i<arr.length ;i++) {
8			xor = xor ^ arr[i];
9		}
10		
11		int mask = (xor & (-1 * xor));
12		int a =0;
13		for(int i=0 ;i<arr.length ;i++) {
14			if((mask & arr[i]) != 0) {
15				a = a^arr[i];
16			}
17		}
18		int b = xor^a;
19		return new int[] {a,b};
20	}
21}