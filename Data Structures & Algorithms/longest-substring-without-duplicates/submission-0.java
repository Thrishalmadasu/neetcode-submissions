class Solution {
    public boolean hasNoRepeating(String s, int i , int j){
        HashSet<Character> set = new HashSet<>();
        for(; i<=j; i++){
            if(set.contains(s.charAt(i))){
                return false;
            }
            set.add(s.charAt(i));
        }
        return true;
    }
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0) return 0;
        int ans = 1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(hasNoRepeating(s,i,j)){
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;
    }
}
