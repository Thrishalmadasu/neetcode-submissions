class Solution {

    public boolean canReachSum(int[] nums, int i, int currS, int t, Boolean[][] dp){
        if(currS == t) return true;

        if(i == nums.length || currS > t) return false;

        if(dp[i][currS]!=null) return dp[i][currS];

        // take it
        boolean take = canReachSum(nums, i+1, currS+nums[i], t, dp);

        // skip it
        boolean skip = canReachSum(nums, i+1, currS, t, dp);

        return dp[i][currS] = (skip || take);
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums) {
            sum+=i;
        }
        if((sum&1) == 1) return false;

        Boolean[][] dp = new Boolean[nums.length][(sum/2)+1];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<((sum/2)+1); j++){
                dp[i][j] = null;
            }
        }

        return canReachSum(nums, 0, 0, sum/2, dp);
    }
}
