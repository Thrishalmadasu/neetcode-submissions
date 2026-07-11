class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] curr = strs[i].toCharArray();
            Arrays.sort(curr);
            String sortedStr = new String(curr);
            if(!map.containsKey(sortedStr)) map.put(sortedStr, new ArrayList<String>());
            map.get(sortedStr).add(strs[i]);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String s : map.keySet()){
            ans.add(map.get(s));
        }
        return ans;
    }
}
