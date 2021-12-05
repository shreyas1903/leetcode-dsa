class Solution {
    public int divide(int dividend, int divisor) {
        
        int INT_MIN = Integer.MIN_VALUE;
        int INT_MAX = Integer.MAX_VALUE;
        
        int count =0;
        if(divisor==dividend)
            return 1;
        else
        if(INT_MIN==dividend && divisor==-1)
            return INT_MAX;
        else
        if(INT_MAX==dividend && divisor==1)
            return INT_MAX;
        else
        if(INT_MIN==dividend && divisor==1)
            return INT_MIN;
        else
        if(INT_MAX==dividend && divisor==-1)
            return INT_MIN+1;
        else
        if(divisor >= 0 && dividend>=0){
            while(divisor <= dividend){
                dividend = dividend - divisor;
                count++;
            }
           
        }
        else
            if(divisor < 0 && dividend<0){
                  int temp = -1* divisor;
                int temp1 = -1*dividend;
                
                while(temp <= temp1){
                  temp1 = temp1 - temp;
                  count++;
                }
            }
        else            
            if(dividend<0)
        {
                int temp = -1*dividend;
            while(divisor <= temp){
                temp = temp - divisor;
                count++;
            }
                count = count * -1;
        }
        else{
            
                   int temp = -1*divisor;
            while(temp <= dividend){
                dividend = dividend - temp;
                count++;
            }
                count = count * -1;
            
        }
         return count;
    }
}   
