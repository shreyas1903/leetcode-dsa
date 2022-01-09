class Solution {
    public String defangIPaddr(String address) {
        
        StringBuilder s = new StringBuilder();
        for(int j =0; j <address.length();j++){
            char c = address.charAt(j);
            if(c == '.'){
                s.append("[.]");
            }
            else
                s.append(c);
        }
        return s.toString();
    }
}
