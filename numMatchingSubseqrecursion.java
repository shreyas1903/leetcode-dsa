class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count=0;
        for(String h : words){
            if(hello(h,s)) count++;
        }
        return count;
    }
    
    public boolean hello(String s, String t){
        int i=0;
        int j=0;
        if(s.equals(t)) return true;
        if(i == s.length()) return true;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
        }
        return i==s.length();
        
    }
}
