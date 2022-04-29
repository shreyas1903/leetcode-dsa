class Solution {
    public int search(int[] nums, int target) {
        return bsearch(nums, 0, nums.length - 1, target);
        
    }
    public int bsearch(int[] nums, int start, int end, int target){
        while(end>= start){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target< nums[mid]){
                return bsearch(nums, start, mid - 1, target);
            }
            else if(target> nums[mid]){
                return bsearch(nums, mid +1, end, target);
            }
            
            
        }
        return -1;
       
        
    }
}
