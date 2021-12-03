class Solution {
    public int removeDuplicates(int[] nums) {
        int b =1, a = 0;
        while(b < nums.length){
            if(nums[a] == nums[b]){
                b++;
            }
            else{
                a++;
                nums[a] = nums[b];
                b++;
            }
        }
        return a+1;
        
        
    }
}
