class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num <10){
            return true;
        }
        else if(num %10 == 0){
            return false;
        }
        return true;
    }
}
