// Last updated: 1/20/2026, 8:52:12 PM
1class Solution {
2    public int numTeams(int[] rating) {
3        return Count_Teams(rating);
4    }
5    public static int Count_Teams(int[] rating){
6        int ans=0;
7        int n = rating.length;
8        for(int i=0;i<n-2;i++){
9            for(int j=i+1;j<n-1;j++){
10                for(int k=j+1;k<n;k++){
11                    if((rating[i]<rating[j] && rating[j]<rating[k]) || (rating[i]>rating[j] && rating[j]>rating[k])){
12                        ans++;
13                    }
14                }
15            }
16        }
17        return ans;
18    }
19}