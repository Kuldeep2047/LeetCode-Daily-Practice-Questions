// Last updated: 5/5/2026, 9:51:22 PM
1class Solution {
2    List<List<Integer>> ans = new ArrayList<>();
3    public List<List<Integer>> combinationSum3(int k, int n) {
4        answer(k, n, 1, 0, new ArrayList<>());
5        return ans;
6    }
7
8    public void answer(int k, int n, int curr,int sum, List<Integer> ll){
9        if(sum == n && ll.size() == k){
10            ans.add(new ArrayList<>(ll));
11            return;
12        }
13        if(sum > n || ll.size() > k || curr > 9){
14            return;
15        }
16
17        ll.add(curr);
18        answer(k, n, curr+1, sum + curr, ll);
19
20        ll.remove(ll.size()-1);
21        answer(k, n, curr+1, sum, ll);
22    }
23}