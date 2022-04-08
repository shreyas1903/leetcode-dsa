class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        
        for(int i =1; i < nums.length; i++){
            if(Arrays.binarySearch(nums,i) < 0)
                return i;
        }
        return nums.length+1;
    }
}
