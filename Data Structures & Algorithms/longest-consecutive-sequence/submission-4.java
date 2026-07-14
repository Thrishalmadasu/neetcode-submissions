class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        int maxStreak = 0;
        for(int i : nums){
            int currStreak = 0;
            int currEle = i;
            if(!set.contains(currEle-1)){
                currStreak = 1;
                while(set.contains(currEle+1)){
                    currStreak++;
                    currEle++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }
}
