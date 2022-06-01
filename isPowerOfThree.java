class Solution {
    public boolean isPowerOfThree(int n) {
        int x=0;
        while(x>=0){
            double res = Math.pow(3,x);
            if(n == res){
                return true;
            }
            else if(res < n){
                x++;
            }
            else if(res > n)
                break;
        }
        return false;
            
    }
}
