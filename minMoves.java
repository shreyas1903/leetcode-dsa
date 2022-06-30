class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        int n=nums[0];
        for(int i:nums){
            count += i-n;
        }
        
        return count;
    }
}
