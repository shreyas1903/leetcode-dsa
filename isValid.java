class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else{
                if(st.empty()){
                    return false;
                }
                else{
                    char chh=st.pop();
                    if(ch==')'&&chh!='('||ch==']'&&chh!='['||ch=='}'&&chh!='{'){
                        return false;
                    }
                }
            }
        }
        return st.empty();
    }
}
