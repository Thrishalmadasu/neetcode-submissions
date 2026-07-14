class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        int[] unq = new int[set.size()];
        int k=0;
        for(int i : set){
            unq[k] = i;
            k++;
        }
        Arrays.sort(unq);
        int ans = 0;
        for(int i=0; i<unq.length; i++){
            int c = 1;
            while(i+1 < unq.length && unq[i+1]-unq[i]==1){
                c++;
                i++;
            }

            ans = Math.max(ans, c);
        }
        return ans;
    }
}
