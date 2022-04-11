class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        
        ans[0] = search(nums, target,'f');
        ans[1]= search(nums, target, 't');
        return ans;
    }
    public int search(int[] nums, int target, char position){
        int ans =-1;
        int start =0;
        int end = nums.length -1;
        for(int i =0; i<nums.length -1; i++){
            int mid = (start + end)/2;
            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                if(start == 'f'){
                    end = mid-1;
                }
                else if( end == 't'){
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
