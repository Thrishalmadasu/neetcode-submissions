class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i , map.getOrDefault(i, 0)+1);
        }

        int uniq = map.keySet().size();

        int[][] pair = new int[uniq][2];
        int j = 0;
        for(int i : map.keySet()){
            pair[j][0] = i;
            pair[j][1] = map.get(i);
            j++;
        }
        Arrays.sort(pair, (a, b) -> b[1] - a[1]);
        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = pair[i][0];
        }
        return ans;
    }

    // TC : O(N) + O(U*logU) + O(k) = O(N + U*logU)
    // SC : O(U)
}
