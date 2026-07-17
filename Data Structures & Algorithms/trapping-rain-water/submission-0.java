class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftPrefix = new int[n];
        int[] rightPrefix = new int[n];

        for(int i=1; i<n; i++){
            leftPrefix[i] = Math.max(leftPrefix[i-1], height[i-1]);
        }

        for(int j=n-2; j>=0; j--){
            rightPrefix[j] = Math.max(rightPrefix[j+1], height[j+1]);
        }

        int ans = 0;

        for(int i=0; i<n; i++){
            int minOfMaxHeights = Math.min(leftPrefix[i], rightPrefix[i]);
            ans+=Math.max(minOfMaxHeights-height[i], 0);
        }

        return ans;
    }
}
