// Last updated: 6/4/2026, 1:38:54 PM
1class Solution {
2    public int totalWaviness(int num1, int num2) {
3        return answer(num1, num2);
4    }
5    public static int answer(int n1, int n2){
6        int ans =0;
7
8        for(int i=n1 ;i<=n2 ;i++){
9            int w =0;
10            String s = String.valueOf(i);
11
12            if(s.length() >=3){
13                
14                for(int j=1 ;j<s.length()-1 ;j++){
15                    char m = s.charAt(j);
16                    char r = s.charAt(j+1);
17                    char l = s.charAt(j-1);
18                    if((m<l && m <r) || (m>l && m>r)){
19                        w++;
20                    }
21                }
22
23                ans += w;
24            }
25        }
26        return ans;
27    }
28}