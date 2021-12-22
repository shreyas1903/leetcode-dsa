class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] x = new int[nums.length];
        int j =0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] %2 == 0){
                x[j] = nums[i];
                j++;
            }
            
        }
         for(int i =0; i < nums.length; i++){
            if(nums[i] % 2 ==1){
                x[j] = nums[i];
                j++;
            }
        }
       
        return x;
    }
}
