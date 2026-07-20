class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int next1 = cost[n-2];
        int next2 = cost[n-1];

        for(int i=n-3; i>=0; i--){
            int curr = Math.min(next1, next2)+cost[i];
            next2 = next1;
            next1 = curr;
        }

        return Math.min(next1, next2);
    }
}
