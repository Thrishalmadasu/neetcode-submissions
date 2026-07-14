class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        int maxStreak = 0;
        for(int i : nums){
            if(!set.contains(i-1)){
                int currStreak = 1;
                while(set.contains(i+currStreak)){
                    currStreak++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }
}
