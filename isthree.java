class Solution {
    public boolean isThree(int n) {
        int count =2;
        for(int i =2; i < n -1; i++){
            if(n%1 == 0){
                count++;
            }
            if(count>=4) return false;
        }
        return count ==3;
    }
}
