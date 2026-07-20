class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int oneStep = cost[n-2];
        int twoStep = cost[n-1];

        for(int i=n-3; i>=0; i--){
            int currStep = Math.min(oneStep, twoStep)+cost[i];
            twoStep = oneStep;
            oneStep = currStep;
        }

        return Math.min(oneStep, twoStep);
    }
}
