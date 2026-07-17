class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l=0, r=n-1;
        int leftMax=0, rightMax=0;
        int ans = 0;
        while(l < r){
            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);
            if(leftMax < rightMax){
                ans+=Math.max(leftMax - height[l], 0);
                l++;
            } else{
                ans+=Math.max(rightMax - height[r], 0);
                r--;
            }
        }
        return ans;
    }
}
