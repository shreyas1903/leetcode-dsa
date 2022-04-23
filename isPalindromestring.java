class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]","");
        s= s.toLowerCase();
        
        for(int i =0; i < s.length()/2; i++){
            
            if(s == null || s.length() ==0)
                return true;
            
            int start = s.charAt(i);
            int end = s.charAt(s.length() - i - 1);
            while(start != end){
                return false;
            }
        }
        return true;
    }
}
