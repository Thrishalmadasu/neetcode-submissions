class Solution {
    public int maxArea(int[] heights) {
        int ans = 0;
        int n = heights.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int vol = Math.min(heights[i], heights[j])*(j-i);
                ans = Math.max(ans, vol);
            }
        }
        return ans;
    }
}
