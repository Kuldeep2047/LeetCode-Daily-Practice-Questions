// Last updated: 1/11/2026, 2:15:39 PM
1class Solution {
2    List<String> ll;
3    public List<String> letterCasePermutation(String s) {
4        ll = new ArrayList<>();
5        answer(s, "");
6        return ll;
7    }
8
9    public void answer(String ques, String ans){
10        if(ques.length() == 0){
11            ll.add(ans);
12            return;
13        }
14
15        char ch = ques.charAt(0);
16        String next = ques.substring(1);
17
18        if(Character.isLetter(ch)){
19            answer(next, ans + Character.toLowerCase(ch));
20            answer(next, ans + Character.toUpperCase(ch));
21
22        }else{
23            answer(next, ans+ch);
24        }
25    }
26}