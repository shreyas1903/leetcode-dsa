class Solution {
    public int addDigits(int num) {
        
        int c=0;
        
        while(num>9){
            while(num >0){
                int rem= num%10;
                c+=rem;
                num /= 10;
                
            }
            num=c;
            c=0;
            
        }
        return num;
        
    }
}
