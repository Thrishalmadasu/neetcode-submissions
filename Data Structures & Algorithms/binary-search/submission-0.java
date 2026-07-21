class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int min = 0, max = n-1;

        while(min <= max){
            int mid = (min+max)/2;

            if(nums[mid]==target) return mid;
            
            if(nums[mid] < target) min = mid+1;
            else max = mid-1;
        }
        return -1;
    }
}
