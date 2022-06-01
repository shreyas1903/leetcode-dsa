class Solution {
    public boolean isPowerOfTwo(int n) {
        int x =0;
         while(x>=0){
             double res = Math.pow(2,x);
             if(res == n)
                 return true;
             else if(res < n){
                 x++;
             }
             else if(res > n)
                  break;
         }
        return false;
    }
}
