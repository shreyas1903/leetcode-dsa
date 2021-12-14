class Solution {
    public int findNumbers(int[] nums) {
        int count =0;

        for(int i = 0; i < nums.length; i++){
            int countdig =0;
            while(nums[i] != 0){
                nums[i] = nums[i]/10;
                countdig++;
            }
            
            if(countdig % 2 == 0){
                count++;
            }
            
        }
        return count;
    }
}
