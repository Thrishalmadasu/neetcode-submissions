class Solution {
    public boolean nonAlphaNumeric(char c){
        if(((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9'))) return false;
        return true;
    }

    public char toLower(char c) {
        if(c >= 'A' && c <= 'Z'){
            return (char)('a'+(int)(c-'A'));
        }
        return c;
    }

    public boolean isPalindrome(String s) {
        int n = s.length();
        int i=0, j=n-1;
        while(i<j){
            while(i<j && nonAlphaNumeric(s.charAt(i))) i++;
            while(j>i && nonAlphaNumeric(s.charAt(j))) j--;

            if(toLower(s.charAt(i)) != (toLower(s.charAt(j)))) return false;
            i++;
            j--;
        }
        return true;
    }
}
