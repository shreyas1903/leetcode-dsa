class Solution {
    public int removeDuplicates(int[] nums) {
        
       
        
        int ans =2;
        for(int i =2; i <nums.length;i++){
            if(nums[i] != nums[ans - 2]){
                nums[ans] = nums[i];
                ans++;
            }
        }
        return ans;
    }
}
