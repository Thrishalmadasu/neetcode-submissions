class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s);
            sb.append("‎");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '‎'){
                ans.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(c);
            }
        }
        return ans;
    }
}
