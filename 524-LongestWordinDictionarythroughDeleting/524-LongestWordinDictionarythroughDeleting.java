// Last updated: 5/7/2026, 10:03:40 PM
1class Solution {
2    public String findLongestWord(String s, List<String> dictionary) {
3        return Longest_word(s,dictionary);
4    }
5    public static String Longest_word(String s,List<String> dictionary){
6        Collections.sort(dictionary);
7        String ans="";
8        for(int i=0;i<dictionary.size();i++){
9            String word = dictionary.get(i);
10            if(word.length()>ans.length()){
11                if(isPresent(s,word)){
12                    ans = word;
13                }
14            }
15        }
16        return ans;
17    }
18    public static boolean isPresent(String s,String word){
19        int i=0;
20        int j=0;
21        while(i<s.length() && j<word.length()){
22            if(s.charAt(i)==word.charAt(j)){
23                j++;
24            }
25            i++;
26        } 
27        return j == word.length();
28    }
29}