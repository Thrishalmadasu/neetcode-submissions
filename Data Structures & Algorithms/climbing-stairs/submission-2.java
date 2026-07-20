class Solution {
    public int helper(int n, int curr, int[] dp){
      if(curr == n) return 1;

      if(dp[curr]!=-1) return dp[curr];

      int ways = 0;
      if((curr+1) <= n) ways+=helper(n, curr+1, dp);
      if((curr+2) <= n) ways+=helper(n, curr+2, dp);

      return dp[curr]=ways;
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n, 0, dp);
    }
}
