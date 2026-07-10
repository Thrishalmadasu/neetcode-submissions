class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] charsOfs = s.toCharArray();
        char[] charsOft = t.toCharArray();

        Arrays.sort(charsOfs);
        Arrays.sort(charsOft);

        for(int i=0; i<s.length(); i++){
            if(charsOfs[i]!=charsOft[i]) return false;
        }
        return true;
    }
}
