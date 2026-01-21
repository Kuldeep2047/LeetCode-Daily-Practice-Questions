// Last updated: 1/21/2026, 12:36:07 PM
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3        return find_x(num1, num2);
4    }
5    public static int find_x(int num1, int num2) {
6		int set_bit=0;
7		while(num2>0) {
8			num2 = (num2 & (num2 -1));
9			set_bit++;
10		}
11		int x =0;
12		for(int i=30 ;i>=0 ;i--) {
13			int mask = (1<<i);
14			if((num1 & mask) != 0) {
15				x |= mask;
16				set_bit--;
17				if(set_bit == 0) {
18					return x;
19				}
20			}
21		}
22		
23		for(int i=0 ;i<=30 ;i++) {
24			int mask = (1<<i);
25			if((num1 & mask) == 0) {
26				x |= mask;
27				set_bit--;
28				if(set_bit == 0) {
29					return x;
30				}
31			}
32		}
33		return x;
34	}
35}