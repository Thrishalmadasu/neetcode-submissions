class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(!map.containsKey(nums[i])) map.put(nums[i], new ArrayList<Integer>());
            map.get(nums[i]).add(i);
        }
        HashSet<ArrayList<Integer>> ans = new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int sum = nums[i]+nums[j];
                int target = -1 * sum;
                if(map.containsKey(target)){
                    for(int index : map.get(target)){
                        if(index != i && index != j){
                            ArrayList<Integer> curr = new ArrayList<Integer>(List.of(nums[i], nums[j], nums[index]));
                            Collections.sort(curr);
                            ans.add(curr);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(ans);
    }
}
