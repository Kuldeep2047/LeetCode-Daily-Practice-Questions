// Last updated: 1/9/2026, 6:34:33 PM
1class Solution {
2    public List<Integer> diffWaysToCompute(String expression) {
3        return answer(expression);
4    }
5
6    public List<Integer> answer(String str){
7        int n = str.length();
8        List<Integer> ans = new ArrayList<>();
9
10        for(int i=0 ;i<n ;i++){
11            char ch = str.charAt(i);
12            if(ch == '+' || ch == '-' || ch == '*'){
13                String left = str.substring(0, i);
14                String right = str.substring(i+1);
15
16                List<Integer> leftAns = answer(left);
17                List<Integer> rightAns = answer(right);
18
19                //combine both result
20                for(int a : leftAns){
21                    for(int b : rightAns){
22                        if(ch == '+'){
23                            ans.add(a+b); 
24                        }
25                        else if( ch == '-'){
26                            ans.add(a-b);
27                        }else{
28                            ans.add(a*b);
29                        }
30                    }
31                }
32            }
33        }
34        //ye base case hai
35        if(ans.isEmpty()){
36            ans.add(Integer.parseInt(str));
37        }
38        
39        return ans;
40    }
41}