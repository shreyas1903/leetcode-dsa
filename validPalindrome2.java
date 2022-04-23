class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return (help(s, start+1, end) || help(s, start, end -1));
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean help(String s, int i , int j){
        int start = i;
        int end = j;
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
