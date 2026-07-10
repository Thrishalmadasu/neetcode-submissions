class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(set.containsKey(target-nums[i])){
                ans[0] = set.get(target-nums[i]);
                ans[1] = i;
                break;
            }

            set.put(nums[i],i);
        }
        return ans;
    }
}
