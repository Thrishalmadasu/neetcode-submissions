class Solution {
    public int helper(int curr, int[] cost, int currCost,int[] dp){
        if(curr == cost.length) return 0;

        if(dp[curr]!=-1) return dp[curr];
        
        int next1 = helper(curr+1,cost,currCost,dp)+cost[curr];

        int next2 = Integer.MAX_VALUE;

        if(curr+2 <= cost.length){
            next2 = helper(curr+2,cost,currCost,dp)+cost[curr];
        }
        return dp[curr]=Math.min(next1, next2);
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(helper(0,cost,0,dp),helper(1,cost,0,dp));
    }
}
