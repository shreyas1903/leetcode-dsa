class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        
        ans[0] = searchStart(nums, target);
        ans[1]= searchEnd(nums, target);
        return ans;
    }
    public int searchStart(int[] nums, int target){
        int ans =-1;
        int start =0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target <= nums[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            if(nums[mid] == target) ans = mid;
        }
        
        return ans;
    }
    public int searchEnd(int[] nums, int target){
        int ans =-1;
        int start =0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target >= nums[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
            if(nums[mid] == target) ans = mid;
        }
        return ans;
    }
}
