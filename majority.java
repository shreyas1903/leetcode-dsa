class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return nums[length/2];
    }
}
