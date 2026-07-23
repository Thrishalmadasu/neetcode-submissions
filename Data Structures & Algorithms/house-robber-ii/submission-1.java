class Solution {
    public int solve(int i, int[] nums, int flag, int[][] dp){
        if((flag==1 && i>=nums.length-1) || i >= nums.length)  return 0;

        if(dp[i][flag]!=-1) return dp[i][flag];

        // take
        int take = solve(i+2, nums, i==0 ? 1 : flag, dp) + nums[i];

        // skip
        int skip = solve(i+1, nums, flag, dp);

        return dp[i][flag]=Math.max(take , skip);
    }

    public int rob(int[] nums) {
        int[][] dp = new int[nums.length][2];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }
        return solve(0, nums, 0, dp);
    }
}
