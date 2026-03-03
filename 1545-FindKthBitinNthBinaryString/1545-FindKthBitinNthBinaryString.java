// Last updated: 3/3/2026, 1:27:39 PM
1class Solution {
2    StringBuilder ans = new StringBuilder();
3    public char findKthBit(int n, int k) {
4        if(n==1 && k == 1){
5            return '0';
6        }
7        StringBuilder ques = new StringBuilder("0");
8        answer(ques, n);
9        
10
11        return ans.charAt(k-1);
12    }
13    public void answer(StringBuilder ques, int n){
14        if(n == 1){
15            ans = ques;
16            return;
17            // return ques;
18        }
19        StringBuilder rev = reverse(new StringBuilder(ques)); 
20
21        StringBuilder newStr = new StringBuilder();
22        newStr.append(ques);
23        newStr.append("1");
24        newStr.append(rev);
25
26        answer(newStr, n - 1);
27    }
28
29    public StringBuilder reverse(StringBuilder s){
30        int n = s.length();
31        for(int i=0 ;i<n ;i++){
32            char ch = s.charAt(i);
33            if(ch == '0'){
34                s.setCharAt(i, '1');
35            }else{
36                s.setCharAt(i, '0');
37            }
38        }
39        return s.reverse();
40    }
41}