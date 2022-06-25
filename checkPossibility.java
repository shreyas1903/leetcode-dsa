class Solution {
    public boolean checkPossibility(int[] nums) {
        int count =0;
        for(int i =0; i < nums.length -1; i++){
            if(nums[i] > nums[i+1]){
                if(i==0) count++;
                else if(nums[i-1] > nums[i+1]){
                    nums[i+1] = nums[i];
                    count++;
                }
                else count++;
            }
            if(count > 1){
            return false;
        }
        }
        
         return true;
    }
}
