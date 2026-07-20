class Solution {

    public int minCost(int currIndex, int[] cost, int currSum, int[] dp){

        if(currIndex == cost.length) return 0;

        if(dp[currIndex]!=-1) return dp[currIndex];

        int cost1 = minCost(currIndex+1, cost, currSum, dp) + cost[currIndex];

        int cost2 = Integer.MAX_VALUE;
        
        if(currIndex+2 <= cost.length){
            cost2 = minCost(currIndex+2, cost, currSum, dp) + cost[currIndex];
        }

        return dp[currIndex]=Math.min(cost1, cost2);
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(minCost(0, cost, 0, dp), minCost(1, cost, 0, dp));
    }
}
