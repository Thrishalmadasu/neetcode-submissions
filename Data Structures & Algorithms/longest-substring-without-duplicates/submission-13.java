class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        // String st = "a ";
        // System.out.println(st.charAt(1));
        if(n==0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 1;
        int i=0;
        for(int j=0; j<n; j++){
            int key = (int)s.charAt(j);

            if(map.containsKey(key) && map.get(key) >= i) i=map.get(key)+1;

            map.put(key, j);
            ans = Math.max(ans, j-i+1);
        }
        return ans;
        
    }
}
