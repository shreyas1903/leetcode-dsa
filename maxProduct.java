class Solution {
    public int maxProduct(int[] nums) {
        int max =0;
        Arrays.sort(nums);
        max = (nums[nums.length - 1]-1)*(nums[nums.length - 2]-1);
        return max;
    }
}
