class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mid = nums[nums.length/2];
        int count=0;
        for(int i:nums){
            count += Math.abs(mid-i);
        }
        
        return count;
    }
}
