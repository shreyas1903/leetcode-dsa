class Solution {
    public boolean checkPowersOfThree(int n) {
        for(int i = 14; i>=0; i--){
            double res = Math.pow(3,i);
            if(n - res >= 0) n -= res;
            if(n  == 0) return true;
        }
        return false;
    }
}
