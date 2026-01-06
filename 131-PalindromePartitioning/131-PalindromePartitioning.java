// Last updated: 1/6/2026, 12:41:03 PM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> ans = new ArrayList<>();
4        List<String> ll = new ArrayList<>();
5
6        answer(s, ans ,ll);
7        return ans;
8    }
9    public void answer(String s, List<List<String>> ans, List<String> ll){
10        if(s.length() == 0){
11            ans.add(new ArrayList<>(ll));
12            return;
13        }
14
15        for(int cut = 1 ;cut <= s.length() ;cut++){
16            String str = s.substring(0, cut);
17            if(isPalindrome(str)){
18                ll.add(str);
19                answer(s.substring(cut), ans, ll);
20                ll.remove(ll.size()-1);
21            }
22        }
23    }
24    public boolean isPalindrome(String s){
25        int i=0 ;
26        int j = s.length()-1;
27        while(i<j){
28            if(s.charAt(i) != s.charAt(j)){
29                return false;
30            }
31            i++;
32            j--;
33        }
34        return true;
35    }
36}