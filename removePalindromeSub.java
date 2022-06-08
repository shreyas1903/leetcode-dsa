class Solution {
    public int removePalindromeSub(String s) {
        if(palindrome(s)){
            return 1;
        }
        return 2;
    }
    
    public boolean palindrome(String s){
        int low = 0;
        int high = s.length()-1;
        while(low <= high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
