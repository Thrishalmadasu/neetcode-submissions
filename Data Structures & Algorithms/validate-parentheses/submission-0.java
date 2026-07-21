class Solution {

    public boolean isOpen(char c){
        return (c=='(' || c=='[' || c=='{');
    }

    public char closePair(char c){
        if(c=='(') return ')';
        if(c=='{') return '}';
        if(c=='[') return ']';
        return ' ';
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(isOpen(c)) st.push(c);
            else {
                if(st.isEmpty() || c!=closePair(st.peek())) return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
