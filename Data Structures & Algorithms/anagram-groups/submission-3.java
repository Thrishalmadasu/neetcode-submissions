class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] freq = new int[26];
            for(int i=0; i<str.length(); i++){
                freq[str.charAt(i)-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int cnt : freq){
                sb.append('#');
                sb.append(cnt);
            }

            String key = sb.toString();

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        List<List<String>> ans = new ArrayList<>();
        for(String key : map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}
