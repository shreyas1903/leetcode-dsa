class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int c=0;
        while(num > 0){
            digits[c++] = num%10;
            num /= 10;
        }
        Arrays.sort(digits);
        return (digits[0] +digits[1])*10+digits[2]+digits[3];
    }
}
