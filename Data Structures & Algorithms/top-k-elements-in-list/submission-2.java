class Solution {
    class Pair {
        int val;
        int freq;

        Pair(int val, int freq){
            this.val = val;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i , map.getOrDefault(i, 0)+1);
        }

        int uniq = map.keySet().size();

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.freq - b.freq);
        for(int i : map.keySet()){
            Pair curr = new Pair(i, map.get(i));
            pq.add(curr);
            if(pq.size() > k) pq.poll();
        }

        int[] ans = new int[k];
        for(int i = 0; i<k ;i++){
            ans[i] = pq.poll().val;
        }
        return ans;
    }

    // TC : O(N) + O(U*logU) + O(k) = O(N + U*logU)
    // SC : O(U)
}
