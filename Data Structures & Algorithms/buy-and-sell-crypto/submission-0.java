class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, n = prices.length;
        for(int i=0; i < n-1 ; i++){
            int maxDay = prices[i+1];
            for(int j=i+1; j<n; j++){
                maxDay = Math.max(maxDay, prices[j]);
            }
            maxProfit = Math.max(maxProfit, maxDay-prices[i]);
        }
        return maxProfit;
    }
}
