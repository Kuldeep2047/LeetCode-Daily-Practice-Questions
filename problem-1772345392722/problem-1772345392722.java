// Last updated: 3/1/2026, 11:39:52 AM
1class Solution {
2    public String trimTrailingVowels(String s) {
3        return answer(s);
4    }
5
6    public String answer(String s){
7        int n = s.length();
8        int idx = n-1;
9        while(idx >=0 ){
10            char ch = s.charAt(idx);
11            if(isVowel(ch)){
12                idx--;
13            }else{
14                break;
15            }
16        }
17        
18        return s.substring(0, idx+1);
19    }
20    public boolean isVowel(char ch){
21        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
22            return true;
23        }
24        return false;
25    }
26}