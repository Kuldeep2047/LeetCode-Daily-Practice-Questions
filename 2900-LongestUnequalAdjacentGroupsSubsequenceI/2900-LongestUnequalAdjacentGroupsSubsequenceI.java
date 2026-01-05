// Last updated: 1/5/2026, 9:54:34 PM
1class Solution {
2    public List<String> getLongestSubsequence(String[] words, int[] groups) {
3        return answer(words, groups);
4    }
5
6    public List<String> answer(String[] words, int[] groups){
7        List<String> ll = new ArrayList<>();
8        int g=groups[0];
9
10        ll.add(words[0]);
11        for(int i=1;i<groups.length;i++){
12            if(groups[i]!=g){
13                ll.add(words[i]);
14                g=groups[i];
15            }
16        }
17        return ll;
18    }
19}