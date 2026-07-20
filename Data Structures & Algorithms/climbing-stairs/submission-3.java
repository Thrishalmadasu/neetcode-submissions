class Solution {
    public int helper(int n, int curr, int[] dp){
      if(curr >= n) return curr==n ? 1 : 0;

      if(dp[curr]!=-1) return dp[curr];

      return dp[curr]=helper(n, curr+1, dp) + helper(n, curr+2, dp);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n, 0, dp);
    }
}
