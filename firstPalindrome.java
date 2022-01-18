class Solution {
    public String firstPalindrome(String[] words) {
        for(String s: words) {
            if(isPalindrome(s, 0, s.length() -1))
                return s;
        }
        return "";
    }
    private boolean isPalindrome(String s, int start, int end) {
        if(start >= end)
            return true;
        if(s.charAt(start) == s.charAt(end))
            return isPalindrome(s, ++start, --end);
        else
            return false;
    }
}
