// Last updated: 1/21/2026, 10:17:02 PM
1class Solution {
2    public int minSwapsCouples(int[] row) {
3        return answer(row);
4    }
5
6    public int answer(int[] row){
7        int n = row.length;
8        Map<Integer, Integer> map = new HashMap<>();
9        //key : person , value : position(index) 
10
11        for(int i=0 ;i<n ;i++){
12            map.put(row[i], i);
13        }
14
15        int swap =0;
16
17        for(int i=0 ;i<n-1 ;i+=2){
18            int person = row[i];
19            int partner = row[i] ^ 1;
20
21            if(row[i+1] == partner){
22                continue;
23            }
24
25            int partner_idx = map.get(partner);
26
27            //update position in map
28
29            map.put(partner, i+1);
30            map.put(row[i+1], partner_idx);
31
32            //swap persons
33            int temp = row[partner_idx];
34            row[partner_idx] = row[i+1];
35            row[i+1] = temp;
36            swap++;
37        }
38
39        return swap;
40    }
41}