class Solution {
    int[] freq;
    public boolean isValid(int[] freq, int i, int j, int k){
        int maxFreq = 0;
        for(int fr : freq){
            maxFreq = Math.max(maxFreq, fr);
        }
        return ((j-i+1-maxFreq) <= k);
    }
    public int characterReplacement(String s, int k) {
        int n = s.length();
        freq = new int[26];
        int i=0,j=0,ans=0;
        while(j<n){
            freq[s.charAt(j)-'A']++;
            while(!isValid(freq, i, j, k)){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}
