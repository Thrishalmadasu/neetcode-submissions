class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0;i<strs.length;i++){
            int[] count = new int[26];
            for(char c : strs[i].toCharArray()){
                count[c-'a']++;
            }
            String s = Arrays.toString(count);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<Integer>());
            }
            map.get(s).add(i);
        }



        for(String s : map.keySet()){
            ArrayList<String> curr = new ArrayList<>();
            for(int i : map.get(s)){
                curr.add(strs[i]);
            }
            ans.add(curr);
        }

        return ans;
    }
}
