class Solution {
    public boolean isSubsequence(String s, String t) {
        return isf(s,t,0,0);
    }
    
    public boolean isf(String s, String t, int i, int j){
        
        if(i == s.length()) return true;
        
        if(i<s.length() && j == t.length()) return false;
        if(s.charAt(i) == t.charAt(j)){
            return isf(s,t, i+1, j+1);
        }
        else{
            return isf(s,t,i,j+1);
        }
    }
}
