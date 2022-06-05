class Solution {
    boolean isPalindrome(String s){
       int i =0; 
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                    return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String res = "";
        
        for(int i =0; i < s.length(); i++){
             
            for(int j = s.length() - 1; j>i; j--){
                String temp = s.substring(i,j+1);
                if(temp.length() > res.length() && isPalindrome(temp)){
                    res = temp;
                    break;
                }
                
            }
        }
        return (res.length()>0) ? res: s.charAt(0) + "";
    }
}
