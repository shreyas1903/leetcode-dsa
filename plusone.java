class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits.length == 0)
            return digits;
        for(int i = n-1; i >= 0 ; i--){
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            digits[i] =0;
            
            
        }
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
        
    }
}
