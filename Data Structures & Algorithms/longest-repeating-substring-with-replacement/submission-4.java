class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int i=0,j=0,maxF=0,ans=0;
        int[] freq = new int[26];
        while(j<n){
            freq[s.charAt(j)-'A']++;
            maxF = Math.max(freq[s.charAt(j)-'A'], maxF);

            if((j-i+1-maxF) <= k) {
                ans = Math.max(ans, j-i+1);
            } else{
                freq[s.charAt(i)-'A']--;
                i++;
            }
            j++;
        }
        return ans;
    }
}
