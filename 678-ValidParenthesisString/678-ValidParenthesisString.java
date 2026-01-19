// Last updated: 1/19/2026, 3:23:33 PM
1class Solution {
2    public boolean checkValidString(String s) {
3        return valid_parenthesis(s);
4    }
5
6    public static boolean valid_parenthesis(String s){
7        int n = s.length();
8        int minOpen =0;
9        int maxOpen = 0;
10        for(int i=0 ;i<n ;i++){
11            char ch = s.charAt(i);
12            if(ch == '('){
13                minOpen++;
14                maxOpen++;
15            }
16            else if(ch == ')'){
17                minOpen--;
18                maxOpen--;
19            }
20            else{
21                //if we take (
22                minOpen--;
23                //if we take )
24                maxOpen++;
25            }
26            if(minOpen < 0){
27                minOpen = 0;
28            }
29            if(maxOpen < 0){
30                return false;
31            }
32        }
33        return minOpen == 0;
34    }
35}