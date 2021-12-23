class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int[] res = new int[nums.length];
        int x=0, y =1;
        for(int i =0; i<nums.length; i++){
            if(nums[i] %2==0 ){
            res[x] = nums[i];
            x +=2;
        }
        else {
            res[y] = nums[i];
            y+=2;
        }
        }
        return res;
    }
}
