class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i =0; i+k-1 < n; i++){
            if((nums[i+k-1] - nums[i]) < min){
                min = (nums[i+k-1] - nums[i]);
            }
        }
        return min;
    }
}
