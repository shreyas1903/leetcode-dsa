class Solution {
    public boolean isPerfectSquare(int num) {
        int y = (int)(Math.sqrt(num));
        if(y*y == num)
            return true;
        else 
            return false;
    }
}
