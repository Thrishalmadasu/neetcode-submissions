class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int s=0, e=n-1;
        int ans = 0;
        while(s<e){
            int vol = Math.min(heights[s], heights[e])*(e-s);
            ans = Math.max(ans, vol);
            if(heights[s] < heights[e]){
                s++;
            }else {
                e--;
            }
        }
        return ans;
    }
    // TC : O(n)
    // SC : O(1)
}
