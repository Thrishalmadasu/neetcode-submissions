class Solution {
    List<List<Integer>> sets;

    public void dfs(int[] nums, int i,List<Integer> curr){
        if(i==nums.length){
            sets.add(new ArrayList<Integer>(curr));
            return;
        }

        // skip it
        dfs(nums, i+1, curr);

        //take it
        curr.add(nums[i]);
        dfs(nums, i+1, curr);
        curr.remove(curr.size()-1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        sets = new ArrayList<>();
        dfs(nums, 0, new ArrayList<Integer>());
        return sets;
    }
}
