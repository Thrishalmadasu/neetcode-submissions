class Solution {
    public int solve(int currHouse, int[] houses, int[] dp){
        if(currHouse == houses.length) return 0;
        if(dp[currHouse] != -1) return dp[currHouse];
        // rob this house
        int rob = houses[currHouse];

        if(currHouse+2 <= houses.length){
         rob+=solve(currHouse+2, houses, dp);
        }

        // skip this house
        int skip = solve(currHouse+1, houses, dp);

        return dp[currHouse]=Math.max(rob, skip);
    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return solve(0, nums, dp);
    }
}
