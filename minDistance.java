class Solution {
    public int minDistance(String word1, String word2) {
        return hello(word1, word2, word1.length() - 1, word2.length() - 1);
    }
    public int hello(String s, String t, int i, int j){
        if(i < 0){
            return j+1;
            
        }
        if(j< 0){
            return i+1;
        }
        if(s.charAt(i) == t.charAt(j)){
            return hello(s,t,i-1,j-1);
        }
        return 1 + Math.min(hello(s,t,i-1,j) , hello(s,t,i,j-1));
    }
}
